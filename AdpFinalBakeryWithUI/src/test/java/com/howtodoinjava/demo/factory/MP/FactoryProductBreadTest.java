package com.howtodoinjava.demo.factory.MP;


import com.howtodoinjava.demo.domain.MP.ProductBread;
import org.junit.Assert;
import org.junit.Test;

public class FactoryProductBreadTest {

    @Test
    public void getProductBread() {

        String category="Burdger Rools";
        int amount=100;

        ProductBread hd=FactoryProductBread.getProductBread(category,amount);

        Assert.assertNotNull(hd);
    }
}