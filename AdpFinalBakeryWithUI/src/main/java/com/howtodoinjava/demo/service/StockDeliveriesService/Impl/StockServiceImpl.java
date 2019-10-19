package com.howtodoinjava.demo.service.StockDeliveriesService.Impl;


import com.howtodoinjava.demo.domain.StockDeliveries.Stock;
import com.howtodoinjava.demo.repository.StockDeliveriesRepo.Impl.StockRepositoryImpl;
import com.howtodoinjava.demo.repository.StockDeliveriesRepo.StockRepository;
import com.howtodoinjava.demo.service.StockDeliveriesService.StockService;

import java.util.Set;

public class StockServiceImpl implements StockService {
    private  StockServiceImpl service = null;
    private StockRepository repository;

    private StockServiceImpl(){
        this.repository = StockRepositoryImpl.getRepository();
    }
    public StockServiceImpl getService(){
        if (service == null){
            service = new StockServiceImpl();
        }
        return service;
    }




    public Set<Stock> getAll() {
        return this.repository.getAll();
    }


    public Stock create(Stock stock) {
        return this.repository.create(stock);
    }


    public Stock read(String integer) {
        return this.repository.read(integer);
    }


    public Stock update(Stock stock) {
        return this.repository.update(stock);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
