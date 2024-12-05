package com.example.chainOfResponsability.component;

import com.example.chainOfResponsability.dto.PayloadDTO;
import com.example.chainOfResponsability.interfac.impl.AbstractHandler;
import org.springframework.stereotype.Component;

@Component
public class UnzipHandler extends AbstractHandler {

    @Override
    public void handle(PayloadDTO payload) {
        payload.getInboundRoute().stream()
                .filter(route -> "UNZIP".equals(route.getCode()) && !route.isProcessingStage())
                .forEach(route -> {
                    // Lógica específica para UNZIP
                    System.out.println("Procesando UNZIP...");
                });

        // Llamar al siguiente manejador en la cadena
        super.handle(payload);
    }
}
