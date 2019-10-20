package com.howtodoinjava.demo.controller.Town;


import com.howtodoinjava.demo.domain.Town.TownBaker;
import com.howtodoinjava.demo.service.TownService.Impl.TownBakerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


public class TownBakerController {
    @Autowired
    @Qualifier("TownBakerServiceImpl")
    private TownBakerServiceImpl service;

    @PostMapping("/new")
    public TownBaker create(@RequestBody TownBaker accountant){

        return service.create(accountant);
    }

    @GetMapping(path = "/find/{id}")
    public TownBaker findById(@PathVariable String id){

        TownBaker accountant = service.read(id);
        return accountant;
    }

    @PutMapping("/update")
    public void update(@RequestBody TownBaker accountant){

        service.update(accountant);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<TownBaker> getAll(){
        return service.getAll();
    }

}
