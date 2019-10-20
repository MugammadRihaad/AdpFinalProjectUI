package com.howtodoinjava.demo.controller.Office;



import com.howtodoinjava.demo.domain.HeadOffice;
import com.howtodoinjava.demo.service.HeadOfficeService.Impl.HeadOfficeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class HeadOfficeController {
    @Autowired
    @Qualifier("HeadOfficeServiceImpl")
    private HeadOfficeServiceImpl service;

    @PostMapping("/new")
    public HeadOffice create(@RequestBody HeadOffice accountant){

        return service.create(accountant);
    }

    @GetMapping(path = "/find/{id}")
    public HeadOffice findById(@PathVariable String id){

        HeadOffice accountant = service.read(id);
        return accountant;
    }

    @PutMapping("/update")
    public void update(@RequestBody HeadOffice accountant){

        service.update(accountant);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<HeadOffice> getAll(){
        return service.getAll();
    }

}
