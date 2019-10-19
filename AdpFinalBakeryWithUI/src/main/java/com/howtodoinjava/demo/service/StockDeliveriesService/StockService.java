package com.howtodoinjava.demo.service.StockDeliveriesService;


import com.howtodoinjava.demo.domain.StockDeliveries.Stock;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface StockService extends IService<Stock, String> {
    Set<Stock> getAll();
}