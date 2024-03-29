package com.howtodoinjava.demo.controller.StockDeliveries;


import com.howtodoinjava.demo.domain.StockDeliveries.StockDeliveries;
import com.howtodoinjava.demo.service.StockDeliveriesService.Impl.StockDeliveriesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class StockDeliveriesController {
    @Autowired
    @Qualifier("StockDeliveriesServiceImpl")
    private StockDeliveriesServiceImpl service;

    @PostMapping("/new")
    public StockDeliveries create(@RequestBody StockDeliveries accountant){

        return service.create(accountant);
    }

    @GetMapping(path = "/find/{id}")
    public StockDeliveries findById(@PathVariable String id){

        StockDeliveries accountant = service.read(id);
        return accountant;
    }

    @PutMapping("/update")
    public void update(@RequestBody StockDeliveries accountant){

        service.update(accountant);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<StockDeliveries> getAll(){
        return service.getAll();
    }

}
