package com.example.chainOfResponsability.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResultDTO {
    private String status;
    private List<Document> documents;

    @Data
    public static class Document {
        private String type;
        private String filename;
        private String prefix;
    }
}
