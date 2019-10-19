package com.howtodoinjava.demo.factory.MP;


import com.howtodoinjava.demo.domain.MP.MPDelivery;
import org.junit.Assert;
import org.junit.Test;

public class FactoryMPDeliveryTest {

    @Test
    public void getMPDelivery() {

        MPDelivery hd= FactoryMPDelivery.getMPDelivery();

        Assert.assertNotNull(hd);
    }
}