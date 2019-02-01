package com.design.pattern.strategy.java.refactoring.enums;

import com.design.pattern.strategy.java.refactoring.freight.Drone;
import com.design.pattern.strategy.java.refactoring.freight.Express;
import com.design.pattern.strategy.java.refactoring.freight.Normal;
import com.design.pattern.strategy.java.refactoring.freight.Freight;

public enum FreightType {
    DRONE{
        @Override
        public Freight getFreight() {
            return new Drone();
        }
    },
    EXPRESS{
        @Override
        public Freight getFreight() {
            return new Express();
        }
    },
    NORMAL{
        @Override
        public Freight getFreight() {
            return new Normal();
        }
    },
    PAC{
        @Override
        public Freight getFreight() {
            return new Normal();
        }
    },
    SCHEDULED{
        @Override
        public Freight getFreight() {
            return new Express();
        }
    };

    public abstract Freight getFreight();
}
