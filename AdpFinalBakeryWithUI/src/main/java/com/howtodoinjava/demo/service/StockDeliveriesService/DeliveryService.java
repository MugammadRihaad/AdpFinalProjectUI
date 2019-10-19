package com.howtodoinjava.demo.service.StockDeliveriesService;


import com.howtodoinjava.demo.domain.StockDeliveries.Deliveries;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface DeliveryService extends IService<Deliveries, String> {
    Set<Deliveries> getAll();
}