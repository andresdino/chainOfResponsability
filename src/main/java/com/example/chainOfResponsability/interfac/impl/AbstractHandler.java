package com.example.chainOfResponsability.interfac.impl;

import com.example.chainOfResponsability.dto.PayloadDTO;
import com.example.chainOfResponsability.interfac.ChainHandler;

public abstract class AbstractHandler implements ChainHandler {
    private ChainHandler next;

    @Override
    public void setNext(ChainHandler next) {
        this.next = next;
    }

    @Override
    public void handle(PayloadDTO payload) {
        if (next != null) {
            next.handle(payload);
        }
    }
}
