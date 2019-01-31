package com.design.pattern.strategy.java.unrefactoring;

import com.design.pattern.strategy.java.unrefactoring.enums.FreightType;

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
