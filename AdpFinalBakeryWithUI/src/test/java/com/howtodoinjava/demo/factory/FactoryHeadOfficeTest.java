package com.howtodoinjava.demo.factory;


import com.howtodoinjava.demo.domain.HeadOffice;
import com.howtodoinjava.demo.factory.HeadOffice.FactoryHeadOffice;
import org.junit.Assert;
import org.junit.Test;

public class FactoryHeadOfficeTest {

    @Test
    public void getHeadOffice() {


        HeadOffice hd= FactoryHeadOffice.getHeadOffice();

        Assert.assertNotNull(hd);
    }
}