package com.design.pattern.strategy.java.unrefactoring;


import com.design.pattern.strategy.java.unrefactoring.enums.FreightType;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(JUnit4.class)
@SpringBootTest
public class FreightTest {

    private Freight freight;

    @Before
    public void setUp(){
        freight = new Freight();
    }

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