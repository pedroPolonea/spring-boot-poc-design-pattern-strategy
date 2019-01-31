package com.design.pattern.strategy;

import com.design.pattern.strategy.spring.refactoring.enums.FreightType;
import com.design.pattern.strategy.spring.refactoring.strategy.FreightStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrategyApplication.class, args);
	}

}

