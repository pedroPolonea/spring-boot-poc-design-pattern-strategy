package com.design.pattern.adapter.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedicalAnalysis {
    private String name;
    private LocalDate dateAnalysis;
    private String documentBody;
    private String opinionDocumentaryAnalysis;
    private String medicalEvaluation;
}
