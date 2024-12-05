package com.example.chainOfResponsability.service;

import com.example.chainOfResponsability.component.AccumulateHandler;
import com.example.chainOfResponsability.component.TransformHandler;
import com.example.chainOfResponsability.component.UnzipHandler;
import com.example.chainOfResponsability.dto.PayloadDTO;
import com.example.chainOfResponsability.interfac.ChainHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChainOfResponsibilityService {

    private final ChainHandler chain;

    @Autowired
    public ChainOfResponsibilityService(UnzipHandler unzipHandler,
                                        TransformHandler transformHandler,
                                        AccumulateHandler accumulateHandler) {
        // Configuración de la cadena
        unzipHandler.setNext(transformHandler);
        transformHandler.setNext(accumulateHandler);
        this.chain = unzipHandler; // El primer manejador
    }

    public void processPayload(PayloadDTO payload) {
        chain.handle(payload);
    }
}
