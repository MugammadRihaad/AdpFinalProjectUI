package com.howtodoinjava.demo.controller.StockDeliveries;



import com.howtodoinjava.demo.domain.StockDeliveries.Deliveries;
import com.howtodoinjava.demo.service.StockDeliveriesService.Impl.DeliveryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class DeliveryController {
    @Autowired
    @Qualifier("DeliveryServiceImpl")
    private DeliveryServiceImpl service;

    @PostMapping("/new")
    public Deliveries create(@RequestBody Deliveries accountant){

        return service.create(accountant);
    }

    @GetMapping(path = "/find/{id}")
    public Deliveries findById(@PathVariable String id){

        Deliveries accountant = service.read(id);
        return accountant;
    }

    @PutMapping("/update")
    public void update(@RequestBody Deliveries accountant){

        service.update(accountant);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<Deliveries> getAll(){
        return service.getAll();
    }

}
