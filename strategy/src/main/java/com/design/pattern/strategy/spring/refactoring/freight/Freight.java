package com.design.pattern.strategy.spring.refactoring.freight;

import com.design.pattern.strategy.spring.refactoring.enums.FreightType;

import java.util.List;

public interface Freight {
    List<FreightType> getFreightType();
    double calcule(double valor);
}
