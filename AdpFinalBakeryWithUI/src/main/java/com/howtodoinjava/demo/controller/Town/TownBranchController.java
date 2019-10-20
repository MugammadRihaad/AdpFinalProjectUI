package com.howtodoinjava.demo.controller.Town;


import com.howtodoinjava.demo.domain.Town.TownBranch;
import com.howtodoinjava.demo.service.TownService.Impl.TownBranchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class TownBranchController {
    @Autowired
    @Qualifier("TownBranchServiceImpl")
    private TownBranchServiceImpl service;

    @PostMapping("/new")
    public TownBranch create(@RequestBody TownBranch accountant){

        return service.create(accountant);
    }

    @GetMapping(path = "/find/{id}")
    public TownBranch findById(@PathVariable String id){

        TownBranch accountant = service.read(id);
        return accountant;
    }

    @PutMapping("/update")
    public void update(@RequestBody TownBranch accountant){

        service.update(accountant);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<TownBranch> getAll(){
        return service.getAll();
    }

}
