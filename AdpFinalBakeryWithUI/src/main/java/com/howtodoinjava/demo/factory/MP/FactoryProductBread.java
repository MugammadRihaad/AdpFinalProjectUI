package com.howtodoinjava.demo.factory.MP;


import com.howtodoinjava.demo.domain.MP.ProductBread;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryProductBread {
    public static ProductBread getProductBread(String category, int amount){
        return new ProductBread.Builder()
                .productBreadId(IDGenerator.generateId())
                .category(category)
                .amount(amount)
                .build();
    }
}
