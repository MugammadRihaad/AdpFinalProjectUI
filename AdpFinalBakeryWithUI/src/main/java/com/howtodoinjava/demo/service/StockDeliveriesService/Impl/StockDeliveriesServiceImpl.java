package com.howtodoinjava.demo.service.StockDeliveriesService.Impl;


import com.howtodoinjava.demo.domain.StockDeliveries.StockDeliveries;
import com.howtodoinjava.demo.repository.StockDeliveriesRepo.Impl.StockDeliveriesRepositoryImpl;
import com.howtodoinjava.demo.repository.StockDeliveriesRepo.StockDeliveriesRepository;
import com.howtodoinjava.demo.service.StockDeliveriesService.StockDeliveriesService;

import java.util.Set;

public class StockDeliveriesServiceImpl implements StockDeliveriesService {
    private  StockDeliveriesServiceImpl service = null;
    private StockDeliveriesRepository repository;

    private StockDeliveriesServiceImpl(){
        this.repository = StockDeliveriesRepositoryImpl.getRepository();
    }
    public StockDeliveriesServiceImpl getService(){
        if (service == null){
            service = new StockDeliveriesServiceImpl();
        }
        return service;
    }




    public Set<StockDeliveries> getAll() {
        return this.repository.getAll();
    }


    public StockDeliveries create(StockDeliveries stockDeliveries) {
        return this.repository.create(stockDeliveries);
    }


    public StockDeliveries read(String integer) {
        return this.repository.read(integer);
    }


    public StockDeliveries update(StockDeliveries stockDeliveries) {
        return this.repository.update(stockDeliveries);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
