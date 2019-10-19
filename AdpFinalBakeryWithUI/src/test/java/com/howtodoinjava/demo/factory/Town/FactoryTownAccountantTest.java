package com.howtodoinjava.demo.factory.Town;


import com.howtodoinjava.demo.domain.Town.TownAccountant;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTownAccountantTest {

    @Test
    public void getTownAccountant() {


        TownAccountant ta=FactoryTownAccountant.getTownAccountant();

        Assert.assertNotNull(ta);
    }
}