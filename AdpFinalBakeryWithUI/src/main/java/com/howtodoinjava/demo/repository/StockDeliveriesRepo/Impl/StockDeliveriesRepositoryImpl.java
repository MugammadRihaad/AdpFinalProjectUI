package com.howtodoinjava.demo.repository.StockDeliveriesRepo.Impl;


import com.howtodoinjava.demo.domain.StockDeliveries.StockDeliveries;
import com.howtodoinjava.demo.repository.StockDeliveriesRepo.StockDeliveriesRepository;

import java.util.HashSet;
import java.util.Set;

public class StockDeliveriesRepositoryImpl implements StockDeliveriesRepository {
    private static StockDeliveriesRepositoryImpl repository = null;
    private Set<StockDeliveries> stockDeliveries;

    private StockDeliveriesRepositoryImpl(){
        this.stockDeliveries = new HashSet<>();
    }

    public static StockDeliveriesRepositoryImpl getRepository(){
        if (repository == null) repository = new StockDeliveriesRepositoryImpl();
        return repository;
    }


    public StockDeliveries create(StockDeliveries stockdel){
        this.stockDeliveries.add(stockdel);
        return stockdel;
    }

    public StockDeliveries read(String stockdelId){
        return stockDeliveries.stream().filter(stockdel -> stockdel.getDelId().equals(stockdelId)).findAny().orElse(null);
    }

    public void delete(String stockdelId) {
        StockDeliveries toDelete = read(stockdelId);
        stockDeliveries.remove(toDelete);
    }

    public StockDeliveries update(StockDeliveries stockdel){
        StockDeliveries toDelete = read(stockdel.getDelId());
        if(toDelete != null) {
            stockDeliveries.remove(toDelete);
            stockDeliveries.add(stockdel);
            return stockdel;
        }
        return null;
    }


    public Set<StockDeliveries> getAll(){
        return this.stockDeliveries;
    }
}
