package com.example.chainOfResponsability.dto;

import lombok.*;


public class InboundRoute {
    private String code;
    private boolean processingStage;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isProcessingStage() {
        return processingStage;
    }

    public void setProcessingStage(boolean processingStage) {
        this.processingStage = processingStage;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    private Config config;
}



