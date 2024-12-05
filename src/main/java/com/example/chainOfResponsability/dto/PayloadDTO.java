package com.example.chainOfResponsability.dto;


import lombok.Data;

import java.util.List;

@Data
public class PayloadDTO {

    private String transactionId;
    private List<InboundRoute> inboundRoute;
    private DataDTO data;
    private ResultDTO result;
}
