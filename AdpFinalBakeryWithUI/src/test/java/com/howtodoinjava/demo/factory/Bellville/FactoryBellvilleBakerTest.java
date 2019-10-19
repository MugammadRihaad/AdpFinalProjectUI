package com.howtodoinjava.demo.factory.Bellville;


import com.howtodoinjava.demo.domain.Bellville.bellvilleBaker;
import org.junit.Assert;
import org.junit.Test;

public class FactoryBellvilleBakerTest {

    @Test
    public void getBellvilleBaker() {

        String bellBakerName="bbn780";
        double bellBakerSalary=10000;

        bellvilleBaker hd=FactoryBellvilleBaker.getBellvilleBaker(bellBakerName,bellBakerSalary);

        Assert.assertNotNull(hd);
    }
}