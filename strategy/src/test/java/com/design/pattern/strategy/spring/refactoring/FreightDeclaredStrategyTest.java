package com.design.pattern.strategy.spring.refactoring;

import com.design.pattern.strategy.spring.refactoring.enums.FreightType;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FreightDeclaredStrategyTest {
    @Autowired
    FreightDeclaredStrategy freightStrategy;

    @Test
    public void souldCalculeFreightTypeNormal() {
        double value = 1.2;
        double calcule = freightStrategy.getFreight(FreightType.NORMAL).calcule(value);

        Assert.assertThat(calcule, CoreMatchers.is(value*2));
    }

    @Test
    public void souldCalculeFreightTypePac() {
        double value = 1.2;
        double calcule = freightStrategy.getFreight(FreightType.PAC).calcule(value);

        Assert.assertThat(calcule, CoreMatchers.is(value*2));
    }

    @Test
    public void souldCalculeFreightTypeDrone() {
        double value = 1.2;
        double calcule = freightStrategy.getFreight(FreightType.DRONE).calcule(value);

        Assert.assertThat(calcule, CoreMatchers.is(value*100));
    }

    @Test
    public void souldCalculeFreightTypeExpress() {
        double value = 1.2;
        double calcule = freightStrategy.getFreight(FreightType.EXPRESS).calcule(value);

        Assert.assertThat(calcule, CoreMatchers.is(value*50));
    }

    @Test
    public void souldCalculeFreightTypeScheduled() {
        double value = 1.2;
        double calcule = freightStrategy.getFreight(FreightType.SCHEDULED).calcule(value);

        Assert.assertThat(calcule, CoreMatchers.is(value*50));
    }
}