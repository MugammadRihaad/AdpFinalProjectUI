package com.howtodoinjava.demo.factory.MP;


import com.howtodoinjava.demo.domain.MP.MPAccountant;
import org.junit.Assert;
import org.junit.Test;

public class FactoryMPAccountantTest {

    @Test
    public void getMPAccountant() {

        MPAccountant ma=FactoryMPAccountant.getMPAccountant();

        Assert.assertNotNull(ma);
    }
}