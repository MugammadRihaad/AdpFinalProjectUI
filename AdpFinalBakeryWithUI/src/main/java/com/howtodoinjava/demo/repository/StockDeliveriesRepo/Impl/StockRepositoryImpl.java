package com.howtodoinjava.demo.repository.StockDeliveriesRepo.Impl;


import com.howtodoinjava.demo.domain.StockDeliveries.Stock;
import com.howtodoinjava.demo.repository.StockDeliveriesRepo.StockRepository;

import java.util.HashSet;
import java.util.Set;

public class StockRepositoryImpl implements StockRepository {
    private static StockRepositoryImpl repository = null;
    private Set<Stock> stocks;

    private StockRepositoryImpl(){
        this.stocks = new HashSet<>();
    }

    public static StockRepositoryImpl getRepository(){
        if (repository == null) repository = new StockRepositoryImpl();
        return repository;
    }

    public Stock create(Stock stocks){
        this.stocks.add(stocks);
        return stocks;
    }

    public Stock read(String stocksId){
        return stocks.stream().filter(stocks -> stocks.getStockId().equals(stocksId)).findAny().orElse(null);
    }

    public void delete(String stocksId) {
        Stock toDelete = read(stocksId);
        stocks.remove(stocksId);
    }

    public Stock update(Stock stocksId){
        Stock toDelete = read(stocksId.getStockId());
        if(toDelete != null) {
            stocks.remove(toDelete);
            stocks.add(stocksId);
            return stocksId;
        }
        return null;
    }


    public Set<Stock> getAll(){
        return this.stocks;
    }
}
