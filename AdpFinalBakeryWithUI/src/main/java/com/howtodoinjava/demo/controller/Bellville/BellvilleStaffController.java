package com.howtodoinjava.demo.controller.Bellville;



import com.howtodoinjava.demo.domain.Bellville.BellvilleStaff;
import com.howtodoinjava.demo.service.BellvilleService.Impl.BellvilleStaffServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class BellvilleStaffController {
    @Autowired
    @Qualifier("BellvilleStaffServiceImpl")
    private BellvilleStaffServiceImpl service;

    @PostMapping("/new")
    public BellvilleStaff create(@RequestBody BellvilleStaff staff){

        return service.create(staff);
    }

    @GetMapping(path = "/find/{id}")
    public BellvilleStaff findById(@PathVariable String id){

        BellvilleStaff staff = service.read(id);

        return staff;
    }

    @PutMapping("/update")
    public void update(@RequestBody BellvilleStaff staff){

        service.update(staff);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<BellvilleStaff> getAll(){
        return service.getAll();
    }
}
