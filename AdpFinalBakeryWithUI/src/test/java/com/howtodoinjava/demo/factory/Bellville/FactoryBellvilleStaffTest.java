package com.howtodoinjava.demo.factory.Bellville;


import com.howtodoinjava.demo.domain.Bellville.BellvilleStaff;
import org.junit.Assert;
import org.junit.Test;

public class FactoryBellvilleStaffTest {

    @Test
    public void getBellvilleStaff() {

        BellvilleStaff hd=FactoryBellvilleStaff.getBellvilleStaff();

        Assert.assertNotNull(hd);
    }
}