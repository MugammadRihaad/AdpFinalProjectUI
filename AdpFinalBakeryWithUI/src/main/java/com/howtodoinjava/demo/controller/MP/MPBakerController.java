package com.howtodoinjava.demo.controller.MP;



import com.howtodoinjava.demo.domain.MP.MPBaker;
import com.howtodoinjava.demo.service.MPService.Impl.MPBakerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class MPBakerController {
    @Autowired
    @Qualifier("MPBakerServiceImpl")
    private MPBakerServiceImpl service;

    @PostMapping("/new")
    public MPBaker create(@RequestBody MPBaker accountant){

        return service.create(accountant);
    }

    @GetMapping(path = "/find/{id}")
    public MPBaker findById(@PathVariable String id){

        MPBaker accountant = service.read(id);
        return accountant;
    }

    @PutMapping("/update")
    public void update(@RequestBody MPBaker accountant){

        service.update(accountant);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<MPBaker> getAll(){
        return service.getAll();
    }

}
