package com.howtodoinjava.demo.factory.Bellville;


import com.howtodoinjava.demo.domain.Bellville.ProductCakes;
import org.junit.Assert;
import org.junit.Test;

public class FactoryProductCakesTest {

    @Test
    public void getProductCakes() {

        String category="Chocolate";
        int amount=200;

        ProductCakes hd=FactoryProductCakes.getProductCakes(category,amount);

        Assert.assertNotNull(hd);
    }
}