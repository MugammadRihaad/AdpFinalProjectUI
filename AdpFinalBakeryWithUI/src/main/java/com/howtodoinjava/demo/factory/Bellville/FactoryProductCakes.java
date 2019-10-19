package com.howtodoinjava.demo.factory.Bellville;


import com.howtodoinjava.demo.domain.Bellville.ProductCakes;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryProductCakes {
    public static ProductCakes getProductCakes(String category, int amount){
        return new ProductCakes.Builder()
                                .productCakeId(IDGenerator.generateId())
                                .category(category)
                                .amount(amount)
                                .build();
    }
}
