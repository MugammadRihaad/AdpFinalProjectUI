package com.howtodoinjava.demo.factory.MP;


import com.howtodoinjava.demo.domain.MP.MPDelivery;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryMPDelivery {
    public static MPDelivery getMPDelivery(){
        return new MPDelivery.Builder()
                .mpDeliveId(IDGenerator.generateId())
                .mpStockId(IDGenerator.generateId())
                .build();
    }
}
