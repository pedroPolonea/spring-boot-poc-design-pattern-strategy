package com.design.pattern.adapter.medicalserviceprovider;

import com.design.pattern.adapter.entity.MedicalAnalysis;
import com.design.pattern.adapter.medicaldocumentaryanalysis.MedicalDocumentaryAnalysisConsultancy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalConsultancy extends ServiceProviderAbstract<MedicalDocumentaryAnalysisConsultancy> {
    private String medicalEvaluation;

    @Override
    public MedicalAnalysis getMedicalAnalysis(MedicalDocumentaryAnalysisConsultancy medicalDocumentalAnalysis) {
        final MedicalAnalysis medicalAnalysis = medicalDocumentalAnalysis.getMedicalAnalysis();
        medicalAnalysis.setMedicalEvaluation(medicalEvaluation);

        return medicalAnalysis;
    }
}
