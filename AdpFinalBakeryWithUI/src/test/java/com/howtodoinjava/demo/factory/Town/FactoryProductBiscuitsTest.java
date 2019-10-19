package com.howtodoinjava.demo.factory.Town;


import com.howtodoinjava.demo.domain.Town.ProductBiscuits;
import org.junit.Assert;
import org.junit.Test;

public class FactoryProductBiscuitsTest {

    @Test
    public void getProductBiscuits() {


        String category="Chocolate";
        int amount=200;

        ProductBiscuits hd=FactoryProductBiscuits.getProductBiscuits(category,amount);

        Assert.assertNotNull(hd);
    }
}