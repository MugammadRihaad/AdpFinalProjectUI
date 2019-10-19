package com.howtodoinjava.demo.factory.Town;


import com.howtodoinjava.demo.domain.Town.TownDelivery;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryTownDelivery {
    public static TownDelivery getTownDelivery(){
        return new TownDelivery.Builder()
                .tnDeliveId(IDGenerator.generateId())
                .tnStockId(IDGenerator.generateId())
                .build();
    }
}
