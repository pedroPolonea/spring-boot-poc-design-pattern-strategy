package com.design.pattern.adapter.medicaldocumentaryanalysis;

import com.design.pattern.adapter.entity.MedicalAnalysis;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MedicalDocumentaryAnalysisExpertise extends MedicalDocumentaryAnalysisAbstract {

    @Override
    public MedicalAnalysis getMedicalAnalysis() {
        return MedicalAnalysis
                .builder()
                .name("Medical Report Santa Casa")
                .dateAnalysis(LocalDate.now())
                .opinionDocumentaryAnalysis("ok")
                .build();
    }
}
