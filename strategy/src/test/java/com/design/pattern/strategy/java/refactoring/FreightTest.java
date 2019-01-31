package com.design.pattern.strategy.java.refactoring;


import com.design.pattern.strategy.java.refactoring.enums.FreightType;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(JUnit4.class)
@SpringBootTest
public class FreightTest {

    @Test
    public void souldCalculeFreightTypeNormal() {
        double value = 1.2;
        double calcule = FreightType.NORMAL.getFreight().calcule(value);

        Assert.assertThat(calcule, CoreMatchers.is(value*2));
    }

    @Test
    public void souldCalculeFreightTypePac() {
        double value = 1.2;
        double calcule =  FreightType.PAC.getFreight().calcule(value);

        Assert.assertThat(calcule, CoreMatchers.is(value*2));
    }

    @Test
    public void souldCalculeFreightTypeDrone() {
        double value = 1.2;
        double calcule = FreightType.DRONE.getFreight().calcule(value);

        Assert.assertThat(calcule, CoreMatchers.is(value*100));
    }

    @Test
    public void souldCalculeFreightTypeExpress() {
        double value = 1.2;
        double calcule = FreightType.EXPRESS.getFreight().calcule(value);

        Assert.assertThat(calcule, CoreMatchers.is(value*50));
    }

    @Test
    public void souldCalculeFreightTypeScheduled() {
        double value = 1.2;
        double calcule = FreightType.SCHEDULED.getFreight().calcule(value);

        Assert.assertThat(calcule, CoreMatchers.is(value*50));
    }
}