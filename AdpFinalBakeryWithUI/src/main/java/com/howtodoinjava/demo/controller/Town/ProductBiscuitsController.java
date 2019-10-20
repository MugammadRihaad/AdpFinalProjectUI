package com.howtodoinjava.demo.controller.Town;


import com.howtodoinjava.demo.domain.Town.ProductBiscuits;
import com.howtodoinjava.demo.service.TownService.Impl.ProductBiscuitsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class ProductBiscuitsController {
    @Autowired
    @Qualifier("ProductBiscuitsServiceImpl")
    private ProductBiscuitsServiceImpl service;

    @PostMapping("/new")
    public ProductBiscuits create(@RequestBody ProductBiscuits accountant){

        return service.create(accountant);
    }

    @GetMapping(path = "/find/{id}")
    public ProductBiscuits findById(@PathVariable String id){

        ProductBiscuits accountant = service.read(id);
        return accountant;
    }

    @PutMapping("/update")
    public void update(@RequestBody ProductBiscuits accountant){

        service.update(accountant);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<ProductBiscuits> getAll(){
        return service.getAll();
    }
}
