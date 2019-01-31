package com.design.pattern.strategy.spring.unrefactoring;

import com.design.pattern.strategy.spring.unrefactoring.enums.FreightType;
import org.springframework.stereotype.Component;

@Component
public class Freight {
    public double calcule(FreightType freightType, double value){
        if (FreightType.NORMAL.equals(freightType) || FreightType.PAC.equals(freightType)) {
            return value*2;
        } else if (FreightType.EXPRESS.equals(freightType) || FreightType.SCHEDULED.equals(freightType)){
            return value*50;
        } else {
            return value*100;
        }
    }
}
