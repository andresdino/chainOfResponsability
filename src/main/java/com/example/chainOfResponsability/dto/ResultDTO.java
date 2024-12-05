package com.example.chainOfResponsability.dto;

import lombok.*;

import java.util.List;


public class ResultDTO {
    private String status;
    private List<Document> documents;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

}
