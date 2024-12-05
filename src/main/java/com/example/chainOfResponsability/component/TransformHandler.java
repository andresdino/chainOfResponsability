package com.example.chainOfResponsability.component;

import com.example.chainOfResponsability.dto.PayloadDTO;
import com.example.chainOfResponsability.interfac.impl.AbstractHandler;
import org.springframework.stereotype.Component;

@Component
public class TransformHandler extends AbstractHandler {

    @Override
    public void handle(PayloadDTO payload) {
        payload.getInboundRoute().stream()
                .filter(route -> "TRANSFORM".equals(route.getCode()) && !route.isProcessingStage())
                .forEach(route -> {
                    // Lógica específica para TRANSFORM
                    System.out.println("Procesando TRANSFORM...");
                });

        // Llamar al siguiente manejador en la cadena
        super.handle(payload);
    }
}
