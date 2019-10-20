package com.howtodoinjava.demo.controller.MP;


import com.howtodoinjava.demo.domain.MP.MPAccountant;
import com.howtodoinjava.demo.service.MPService.Impl.MPAccountantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class MPAccountController {
    @Autowired
    @Qualifier("MPAccountantServiceImpl")
    private MPAccountantServiceImpl service;

    @PostMapping("/new")
    public MPAccountant create(@RequestBody MPAccountant accountant){

        return service.create(accountant);
    }

    @GetMapping(path = "/find/{id}")
    public  MPAccountant findById(@PathVariable String id){

        MPAccountant accountant = service.read(id);
        return accountant;
    }

    @PutMapping("/update")
    public void update(@RequestBody MPAccountant accountant){

        service.update(accountant);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set< MPAccountant> getAll(){
        return service.getAll();
    }

}
