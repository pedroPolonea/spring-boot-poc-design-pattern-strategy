package com.design.pattern.strategy.java.refactoring.freight;

public class Nomal implements Freight {

    @Override
    public double calcule(double valor) {
        return valor*2;
    }
}
