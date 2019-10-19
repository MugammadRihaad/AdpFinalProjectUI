package com.howtodoinjava.demo.factory.StockDeliveries;


import com.howtodoinjava.demo.domain.StockDeliveries.StockDeliveries;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryStockDeliveries {
    public static StockDeliveries getStockDeliveries(String stockdelId, String stockId){
        return new StockDeliveries.Builder()
                    .delId(IDGenerator.generateId())
                    .stockdelId(stockdelId)
                    .stockId(stockId)
                    .build();
    }
}
