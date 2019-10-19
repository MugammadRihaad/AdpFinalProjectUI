package com.howtodoinjava.demo.repository.StockDeliveriesRepo;


import com.howtodoinjava.demo.domain.StockDeliveries.StockDeliveries;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface StockDeliveriesRepository extends IRepository<StockDeliveries, String> {
    Set<StockDeliveries> getAll();
}
