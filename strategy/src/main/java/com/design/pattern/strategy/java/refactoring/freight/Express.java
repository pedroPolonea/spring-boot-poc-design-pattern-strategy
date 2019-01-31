package com.design.pattern.strategy.java.refactoring.freight;

public class Express implements Freight {

    @Override
    public double calcule(double valor) {
        return valor*50;
    }
}
