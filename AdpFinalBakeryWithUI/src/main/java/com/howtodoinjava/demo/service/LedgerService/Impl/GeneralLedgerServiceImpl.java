package com.howtodoinjava.demo.service.LedgerService.Impl;


import com.howtodoinjava.demo.domain.Ledger.GeneralLedger;
import com.howtodoinjava.demo.repository.LedgerRepo.GeneralLedgerRepository;
import com.howtodoinjava.demo.repository.LedgerRepo.Impl.GeneralLedgerRepositoryImpl;
import com.howtodoinjava.demo.service.LedgerService.GeneralLedgerService;

import java.util.Set;

public class GeneralLedgerServiceImpl implements GeneralLedgerService {
    private  GeneralLedgerServiceImpl service = null;
    private GeneralLedgerRepository repository;

    private GeneralLedgerServiceImpl(){
        this.repository = GeneralLedgerRepositoryImpl.getRepository();
    }
    public GeneralLedgerServiceImpl getService(){
        if (service == null){
            service = new GeneralLedgerServiceImpl();
        }
        return service;
    }




    public Set<GeneralLedger> getAll() {
        return this.repository.getAll();
    }


    public GeneralLedger create(GeneralLedger genLedger) {
        return this.repository.create(genLedger);
    }


    public GeneralLedger read(String integer) {
        return this.repository.read(integer);
    }


    public GeneralLedger update(GeneralLedger genLedger) {
        return this.repository.update(genLedger);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
