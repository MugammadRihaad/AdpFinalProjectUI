package com.howtodoinjava.demo.factory.Town;


import com.howtodoinjava.demo.domain.Town.TownStaff;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTownStaffTest {

    @Test
    public void getTownStaff() {


        TownStaff hd=FactoryTownStaff.getTownStaff();

        Assert.assertNotNull(hd);
    }
}