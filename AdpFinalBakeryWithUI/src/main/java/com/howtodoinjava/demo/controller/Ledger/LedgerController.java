package com.howtodoinjava.demo.controller.Ledger;



import com.howtodoinjava.demo.domain.Ledger.Ledger;
import com.howtodoinjava.demo.service.LedgerService.Impl.LedgerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class LedgerController {
    @Autowired
    @Qualifier("LedgerServiceImpl")
    private LedgerServiceImpl service;

    @PostMapping("/new")
    public Ledger create(@RequestBody Ledger accountant){

        return service.create(accountant);
    }

    @GetMapping(path = "/find/{id}")
    public Ledger findById(@PathVariable String id){

        Ledger accountant = service.read(id);
        return accountant;
    }

    @PutMapping("/update")
    public void update(@RequestBody Ledger accountant){

        service.update(accountant);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getAll")
    public Set<Ledger> getAll(){
        return service.getAll();
    }

}
