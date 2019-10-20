package com.howtodoinjava.demo.controller.Bellville;


import com.howtodoinjava.demo.domain.Bellville.bellvilleBaker;
import com.howtodoinjava.demo.service.BellvilleService.Impl.BellvilleBakerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class BellvilleBakerController {
    @Autowired
    @Qualifier("BellvilleBakerServiceImpl")
    private BellvilleBakerServiceImpl service;

    @PostMapping("/new")
    public bellvilleBaker create(@RequestBody bellvilleBaker baker){

        return service.create(baker);
    }

    @GetMapping(path = "/find/{id}")
    public bellvilleBaker findById(@PathVariable String id){

        bellvilleBaker baker = service.read(id);
        return baker;
    }

    @PutMapping("/update")
    public void update(@RequestBody bellvilleBaker baker){

        service.update(baker);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<bellvilleBaker> getAll(){
        return service.getAll();
    }

}
