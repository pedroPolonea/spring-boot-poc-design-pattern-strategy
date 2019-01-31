package com.design.pattern.strategy.spring.refactoring.freight;

import com.design.pattern.strategy.spring.refactoring.enums.FreightType;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Express implements Freight{
    @Override
    public List<FreightType> getFreightType() {
        return Arrays.asList(FreightType.EXPRESS, FreightType.SCHEDULED);
    }

    @Override
    public double calcule(double valor) {
        return valor*50;
    }
}
