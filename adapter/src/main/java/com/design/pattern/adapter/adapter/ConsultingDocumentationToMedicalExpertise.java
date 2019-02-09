package com.design.pattern.adapter.adapter;

import com.design.pattern.adapter.entity.MedicalAnalysis;
import com.design.pattern.adapter.medicaldocumentaryanalysis.MedicalDocumentaryAnalysisExpertise;
import com.design.pattern.adapter.medicalserviceprovider.MedicalExpertise;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsultingDocumentationToMedicalExpertise extends MedicalExpertise {

    @Override
    public MedicalAnalysis getMedicalAnalysis(MedicalDocumentaryAnalysisExpertise medicalDocumentalAnalysis) {
        MedicalAnalysis medicalAnalysis = medicalDocumentalAnalysis.getMedicalAnalysis();
        medicalAnalysis.setMedicalEvaluation(this.getMedicalEvaluation());

        return medicalAnalysis;
    }
}
