package com.howtodoinjava.demo.factory.Town;


import com.howtodoinjava.demo.domain.Town.ProductBiscuits;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryProductBiscuits {
    public static ProductBiscuits getProductBiscuits(String category, int amount){
        return new ProductBiscuits.Builder()
                .productBiscuitsId(IDGenerator.generateId())
                .category(category)
                .amount(amount)
                .build();
    }
}
