package com.design.pattern.strategy.spring.unrefactoring;


import com.design.pattern.strategy.spring.unrefactoring.enums.FreightType;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FreightTest {
    @Autowired
    private Freight freight;

    @Test
    public void souldCalculeFreightTypeNormal() {
        double value = 1.2;
        double calcule = freight.calcule(FreightType.NORMAL,value);

        Assert.assertThat(calcule, CoreMatchers.is(value*2));
    }

    @Test
    public void souldCalculeFreightTypePac() {
        double value = 1.2;
        double calcule =  freight.calcule(FreightType.PAC, value);

        Assert.assertThat(calcule, CoreMatchers.is(value*2));
    }

    @Test
    public void souldCalculeFreightTypeDrone() {
        double value = 1.2;
        double calcule = freight.calcule(FreightType.DRONE, value);

        Assert.assertThat(calcule, CoreMatchers.is(value*100));
    }

    @Test
    public void souldCalculeFreightTypeExpress() {
        double value = 1.2;
        double calcule = freight.calcule(FreightType.EXPRESS, value);

        Assert.assertThat(calcule, CoreMatchers.is(value*50));
    }

    @Test
    public void souldCalculeFreightTypeScheduled() {
        double value = 1.2;
        double calcule = freight.calcule(FreightType.SCHEDULED, value);

        Assert.assertThat(calcule, CoreMatchers.is(value*50));
    }
}