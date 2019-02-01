package com.design.pattern.strategy.spring.refactoring;

import com.design.pattern.strategy.spring.refactoring.enums.FreightType;
import com.design.pattern.strategy.spring.refactoring.freight.Freight;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@NoArgsConstructor
public class FreightStrategy {

    @Autowired
    private List<Freight> freight;

    private Map<FreightType, Freight> freightMap = new HashMap<>();

    @PostConstruct
    public void init(){
        freight.forEach(freight -> {
            freight.getFreightType().forEach(freightType -> {
                freightMap.put(freightType, freight);
            });
        });
    }

    public Freight getFreight(FreightType freightType){
        return freightMap.get(freightType);
    }
}
