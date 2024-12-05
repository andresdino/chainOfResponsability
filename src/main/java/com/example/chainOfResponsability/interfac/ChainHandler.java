package com.example.chainOfResponsability.interfac;

import com.example.chainOfResponsability.dto.PayloadDTO;


public interface ChainHandler {

    void setNext(ChainHandler next);
    void handle(PayloadDTO payload);
}
