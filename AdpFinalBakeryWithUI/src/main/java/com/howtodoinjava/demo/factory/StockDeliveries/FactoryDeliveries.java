package com.howtodoinjava.demo.factory.StockDeliveries;


import com.howtodoinjava.demo.domain.StockDeliveries.Deliveries;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryDeliveries {
    public static Deliveries getDeliveries(String delivName, int delivAmount, double delivPriceUnit){
        return new Deliveries.Builder()
                .delivId(IDGenerator.generateId())
                .delivName(delivName)
                .delivAmount(delivAmount)
                .delivPriceUnit(delivPriceUnit)
                .build();

    }
}
