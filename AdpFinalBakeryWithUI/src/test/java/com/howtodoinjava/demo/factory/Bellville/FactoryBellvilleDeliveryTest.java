package com.howtodoinjava.demo.factory.Bellville;


import com.howtodoinjava.demo.domain.Bellville.BellvilleDelivery;
import org.junit.Assert;
import org.junit.Test;

public class FactoryBellvilleDeliveryTest {

    @Test
    public void getBellvilleDelivery() {


        BellvilleDelivery hd= FactoryBellvilleDelivery.getBellvilleDelivery();

        Assert.assertNotNull(hd);
    }
}