package com.example.chainOfResponsability.component;

import com.example.chainOfResponsability.dto.PayloadDTO;
import com.example.chainOfResponsability.interfac.impl.AbstractHandler;
import org.springframework.stereotype.Component;

@Component
public class AccumulateHandler extends AbstractHandler {

    @Override
    public void handle(PayloadDTO payload) {
        payload.getInboundRoute().stream()
                .filter(route -> "ACCUMULATE".equals(route.getCode()) && !route.isProcessingStage())
                .forEach(route -> {
                    // Lógica específica para ACCUMULATE
                    System.out.println("Procesando ACCUMULATE...");
                });
        // Llamar al siguiente manejador en la cadena
        super.handle(payload);
    }
}
