package com.design.pattern.adapter.medicalserviceprovider;

import com.design.pattern.adapter.entity.MedicalAnalysis;
import com.design.pattern.adapter.medicaldocumentaryanalysis.MedicalDocumentaryAnalysisExpertise;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalExpertise extends ServiceProviderAbstract<MedicalDocumentaryAnalysisExpertise> {
     private String medicalEvaluation;

    @Override
    public MedicalAnalysis getMedicalAnalysis(MedicalDocumentaryAnalysisExpertise medicalDocumentalAnalysis) {
        MedicalAnalysis medicalAnalysis = medicalDocumentalAnalysis.getMedicalAnalysis();
        medicalAnalysis.setMedicalEvaluation(medicalEvaluation);

        return medicalAnalysis;
    }


}
