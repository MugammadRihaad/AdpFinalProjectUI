package com.howtodoinjava.demo.factory.StockDeliveries;


import com.howtodoinjava.demo.domain.StockDeliveries.Stock;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryStock {
    public static Stock getStock(String stockCategory, int stockAm, double stockWeight){
        return new Stock.Builder()
                .stockCate(stockCategory)
                .stockAmount(stockAm)
                .stockWeight(stockWeight)
                .stockId(IDGenerator.generateId())
                .build();

    }
}
