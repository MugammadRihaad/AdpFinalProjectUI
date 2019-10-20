package com.howtodoinjava.demo.controller.Town;



import com.howtodoinjava.demo.domain.Town.TownAccountant;
import com.howtodoinjava.demo.service.TownService.Impl.TownAccountantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class TownAccountController {
    @Autowired
    @Qualifier("TownAccountantServiceImpl")
    private TownAccountantServiceImpl service;

    @PostMapping("/new")
    public TownAccountant create(@RequestBody TownAccountant accountant){

        return service.create(accountant);
    }

    @GetMapping(path = "/find/{id}")
    public TownAccountant findById(@PathVariable String id){

        TownAccountant accountant = service.read(id);
        return accountant;
    }

    @PutMapping("/update")
    public void update(@RequestBody TownAccountant accountant){

        service.update(accountant);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<TownAccountant> getAll(){
        return service.getAll();
    }

}
