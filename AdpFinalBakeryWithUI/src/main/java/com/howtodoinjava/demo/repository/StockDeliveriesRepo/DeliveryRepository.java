package com.howtodoinjava.demo.repository.StockDeliveriesRepo;


import com.howtodoinjava.demo.domain.StockDeliveries.Deliveries;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface DeliveryRepository extends IRepository<Deliveries, String> {
    Set<Deliveries> getAll();
}