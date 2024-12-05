package com.example.chainOfResponsability.dto;


import lombok.*;

import java.util.List;


public class PayloadDTO {

    private String transactionId;
    private List<InboundRoute> inboundRoute;
    private DataDTO data;
    private ResultDTO result;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public List<InboundRoute> getInboundRoute() {
        return inboundRoute;
    }

    public void setInboundRoute(List<InboundRoute> inboundRoute) {
        this.inboundRoute = inboundRoute;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public ResultDTO getResult() {
        return result;
    }

    public void setResult(ResultDTO result) {
        this.result = result;
    }
}
