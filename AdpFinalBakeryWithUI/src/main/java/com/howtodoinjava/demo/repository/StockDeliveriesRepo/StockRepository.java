package com.howtodoinjava.demo.repository.StockDeliveriesRepo;


import com.howtodoinjava.demo.domain.StockDeliveries.Stock;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface StockRepository extends IRepository<Stock, String> {
    Set<Stock> getAll();
}