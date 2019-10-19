package com.howtodoinjava.demo.factory.Town;


import com.howtodoinjava.demo.domain.Town.TownDelivery;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTownDeliveryTest {

    @Test
    public void getTownDelivery() {


        TownDelivery hd= FactoryTownDelivery.getTownDelivery();

        Assert.assertNotNull(hd);
    }
}