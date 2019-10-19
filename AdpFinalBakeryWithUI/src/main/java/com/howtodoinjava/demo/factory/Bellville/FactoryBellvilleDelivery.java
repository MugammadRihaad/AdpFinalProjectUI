package com.howtodoinjava.demo.factory.Bellville;


import com.howtodoinjava.demo.domain.Bellville.BellvilleDelivery;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryBellvilleDelivery {
    public static BellvilleDelivery getBellvilleDelivery(){
     return new BellvilleDelivery.Builder()
                .bellDeliveId(IDGenerator.generateId())
                .bellStockId(IDGenerator.generateId())
                .build();
    }
}
