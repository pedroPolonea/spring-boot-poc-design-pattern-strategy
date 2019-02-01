package com.design.pattern.strategy.spring.refactoring;

import com.design.pattern.strategy.spring.refactoring.enums.FreightType;
import com.design.pattern.strategy.spring.refactoring.freight.Drone;
import com.design.pattern.strategy.spring.refactoring.freight.Express;
import com.design.pattern.strategy.spring.refactoring.freight.Freight;
import com.design.pattern.strategy.spring.refactoring.freight.Normal;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.Normalizer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@NoArgsConstructor
public class FreightDeclaredStrategy {

    @Autowired
    private Normal normal;

    @Autowired
    private Drone drone;

    @Autowired
    private Express express;

    private Map<FreightType, Freight> freightMap = new HashMap<>();

    @PostConstruct
    public void init(){
        freightMap.put(FreightType.NORMAL, normal);
        freightMap.put(FreightType.PAC, normal);
        freightMap.put(FreightType.EXPRESS, express);
        freightMap.put(FreightType.SCHEDULED, express);
        freightMap.put(FreightType.DRONE, drone);
    }

    public Freight getFreight(FreightType freightType){
        return freightMap.get(freightType);
    }
}
