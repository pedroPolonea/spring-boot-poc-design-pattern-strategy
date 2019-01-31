package com.design.pattern.strategy.java.refactoring.freight;

public class Drone implements Freight {

    @Override
    public double calcule(double valor) {
        return valor*100;
    }
}
