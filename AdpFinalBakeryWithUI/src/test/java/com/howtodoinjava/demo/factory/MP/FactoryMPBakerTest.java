package com.howtodoinjava.demo.factory.MP;


import com.howtodoinjava.demo.domain.MP.MPBaker;
import org.junit.Assert;
import org.junit.Test;

public class FactoryMPBakerTest {

    @Test
    public void getMPBaker() {


            String mpBakerName="bbn780";
            double mpBakerSalary=10000;

            MPBaker hd=FactoryMPBaker.getMPBaker(mpBakerName,mpBakerSalary);

            Assert.assertNotNull(hd);
        }
    }
