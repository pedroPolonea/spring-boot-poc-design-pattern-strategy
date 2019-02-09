package com.design.pattern.adapter.medicalserviceprovider;

import com.design.pattern.adapter.entity.MedicalAnalysis;

public abstract class ServiceProviderAbstract<M> {

    public abstract MedicalAnalysis getMedicalAnalysis(M medicalDocumentalAnalysis);
}
