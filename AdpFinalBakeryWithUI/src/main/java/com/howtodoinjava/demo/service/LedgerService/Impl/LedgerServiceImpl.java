package com.howtodoinjava.demo.service.LedgerService.Impl;


import com.howtodoinjava.demo.domain.Ledger.Ledger;
import com.howtodoinjava.demo.repository.LedgerRepo.Impl.LedgerRepositoryImpl;
import com.howtodoinjava.demo.repository.LedgerRepo.LedgerRepository;
import com.howtodoinjava.demo.service.LedgerService.LedgerService;

import java.util.Set;

public class LedgerServiceImpl implements LedgerService {
    private  LedgerServiceImpl service = null;
    private LedgerRepository repository;

    private LedgerServiceImpl(){
        this.repository = LedgerRepositoryImpl.getRepository();
    }
    public LedgerServiceImpl getService(){
        if (service == null){
            service = new LedgerServiceImpl();
        }
        return service;
    }




    public Set<Ledger> getAll() {
        return this.repository.getAll();
    }


    public Ledger create(Ledger Ledger) {
        return this.repository.create(Ledger);
    }


    public Ledger read(String integer) {
        return this.repository.read(integer);
    }


    public Ledger update(Ledger Ledger) {
        return this.repository.update(Ledger);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}

