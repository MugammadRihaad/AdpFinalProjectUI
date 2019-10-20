package com.howtodoinjava.demo.controller.Town;


import com.howtodoinjava.demo.domain.Town.TownDelivery;
import com.howtodoinjava.demo.service.TownService.Impl.TownDeliveryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class TownDeliveryController {
    @Autowired
    @Qualifier("TownDeliveryServiceImpl")
    private TownDeliveryServiceImpl service;

    @PostMapping("/new")
    public TownDelivery create(@RequestBody TownDelivery accountant){

        return service.create(accountant);
    }

    @GetMapping(path = "/find/{id}")
    public TownDelivery findById(@PathVariable String id){

        TownDelivery accountant = service.read(id);
        return accountant;
    }

    @PutMapping("/update")
    public void update(@RequestBody TownDelivery accountant){

        service.update(accountant);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<TownDelivery> getAll(){
        return service.getAll();
    }

}
