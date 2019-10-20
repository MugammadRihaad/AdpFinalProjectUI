package com.howtodoinjava.demo.controller.MP;


import com.howtodoinjava.demo.domain.MP.MPStaff;
import com.howtodoinjava.demo.service.MPService.Impl.MPStaffServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class MPStaffController {
    @Autowired
    @Qualifier("MPStaffServiceImpl")
    private MPStaffServiceImpl service;

    @PostMapping("/new")
    public MPStaff create(@RequestBody MPStaff accountant){

        return service.create(accountant);
    }

    @GetMapping(path = "/find/{id}")
    public MPStaff findById(@PathVariable String id){

        MPStaff accountant = service.read(id);
        return accountant;
    }

    @PutMapping("/update")
    public void update(@RequestBody MPStaff accountant){

        service.update(accountant);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<MPStaff> getAll(){
        return service.getAll();
    }
}
