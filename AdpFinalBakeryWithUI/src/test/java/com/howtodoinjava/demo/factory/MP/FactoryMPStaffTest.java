package com.howtodoinjava.demo.factory.MP;


import com.howtodoinjava.demo.domain.MP.MPStaff;
import org.junit.Assert;
import org.junit.Test;

public class FactoryMPStaffTest {

    @Test
    public void getMPStaff() {


        MPStaff hd = FactoryMPStaff.getMPStaff();

        Assert.assertNotNull(hd);
    }
}