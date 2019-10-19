package com.howtodoinjava.demo.service.LedgerService.Impl;


import com.howtodoinjava.demo.domain.Ledger.CreditorsLedger;
import com.howtodoinjava.demo.repository.LedgerRepo.CreditorsLedgerRepository;
import com.howtodoinjava.demo.repository.LedgerRepo.Impl.CreditorsLedgerRepositoryImpl;
import com.howtodoinjava.demo.service.LedgerService.CreditorsLedgerService;

import java.util.Set;

public class CreditorsLedgerServiceImpl implements CreditorsLedgerService {
    private  CreditorsLedgerServiceImpl service = null;
    private CreditorsLedgerRepository repository;

    private CreditorsLedgerServiceImpl(){
        this.repository = CreditorsLedgerRepositoryImpl.getRepository();
    }
    public CreditorsLedgerServiceImpl getService(){
        if (service == null){
            service = new CreditorsLedgerServiceImpl();
        }
        return service;
    }




    public Set<CreditorsLedger> getAll() {
        return this.repository.getAll();
    }


    public CreditorsLedger create(CreditorsLedger credLedger) {
        return this.repository.create(credLedger);
    }


    public CreditorsLedger read(String integer) {
        return this.repository.read(integer);
    }


    public CreditorsLedger update(CreditorsLedger credLedger) {
        return this.repository.update(credLedger);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
