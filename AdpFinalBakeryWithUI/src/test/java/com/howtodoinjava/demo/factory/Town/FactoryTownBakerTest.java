package com.howtodoinjava.demo.factory.Town;


import com.howtodoinjava.demo.domain.Town.TownBaker;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTownBakerTest {

    @Test
    public void getTownBaker() {


            String tnBakerName="Michelle";
            double tnBakerSalary=10000;

            TownBaker hd=FactoryTownBaker.getTownBaker(tnBakerName,tnBakerSalary);

            Assert.assertNotNull(hd);
        }
    }
