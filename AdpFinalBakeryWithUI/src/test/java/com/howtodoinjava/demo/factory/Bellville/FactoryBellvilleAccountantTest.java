package com.howtodoinjava.demo.factory.Bellville;


import com.howtodoinjava.demo.domain.Bellville.BellvilleAccountant;
import org.junit.Assert;
import org.junit.Test;

public class FactoryBellvilleAccountantTest {

    @Test
    public void getBellvilleAccountant() {


        BellvilleAccountant ba=FactoryBellvilleAccountant.getBellvilleAccountant();;

        Assert.assertNotNull(ba);
    }
}