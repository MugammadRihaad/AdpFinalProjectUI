package com.howtodoinjava.demo.service.StockDeliveriesService;


import com.howtodoinjava.demo.domain.StockDeliveries.StockDeliveries;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface StockDeliveriesService extends IService<StockDeliveries, String> {
    Set<StockDeliveries> getAll();
}