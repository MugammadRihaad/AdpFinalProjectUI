package com.howtodoinjava.demo.controller.Bellville;


import com.howtodoinjava.demo.domain.Bellville.BellvilleDelivery;
import com.howtodoinjava.demo.service.BellvilleService.Impl.BellvilleDeliveryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


public class BellvilleDeliveryController {
    @Autowired
    @Qualifier("BellvilleDeliveryServiceImpl")
    private BellvilleDeliveryServiceImpl service;

    @PostMapping("/new")
    public BellvilleDelivery create(@RequestBody BellvilleDelivery delivery){

        return service.create(delivery);
    }

    @GetMapping(path = "/find/{id}")
    public BellvilleDelivery findById(@PathVariable String id){

        BellvilleDelivery delivery = service.read(id);

        return delivery;
    }

    @PutMapping("/update")
    public void update(@RequestBody BellvilleDelivery delivery){

        service.update(delivery);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<BellvilleDelivery> getAll(){
        return service.getAll();
    }
}
