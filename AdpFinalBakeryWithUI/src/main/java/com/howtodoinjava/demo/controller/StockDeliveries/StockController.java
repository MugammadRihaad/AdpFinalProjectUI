package com.howtodoinjava.demo.controller.StockDeliveries;


import com.howtodoinjava.demo.domain.StockDeliveries.Stock;
import com.howtodoinjava.demo.service.StockDeliveriesService.Impl.StockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class StockController {
    @Autowired
    @Qualifier("StockServiceImpl")
    private StockServiceImpl service;

    @PostMapping("/new")
    public Stock create(@RequestBody Stock accountant){

        return service.create(accountant);
    }

    @GetMapping(path = "/find/{id}")
    public Stock findById(@PathVariable String id){

        Stock accountant = service.read(id);
        return accountant;
    }

    @PutMapping("/update")
    public void update(@RequestBody Stock accountant){

        service.update(accountant);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<Stock> getAll(){
        return service.getAll();
    }

}
