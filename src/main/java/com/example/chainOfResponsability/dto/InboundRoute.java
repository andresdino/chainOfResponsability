package com.example.chainOfResponsability.dto;

import lombok.Data;

@Data
public class InboundRoute {
    private String code;
    private boolean processingStage;
    private Config config;
}

@Data
class Config {
    private String transformationId;
}
