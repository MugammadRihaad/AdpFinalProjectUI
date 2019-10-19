package com.howtodoinjava.demo.service.LedgerService.Impl;


import com.howtodoinjava.demo.domain.Ledger.BusinessLedger;
import com.howtodoinjava.demo.repository.LedgerRepo.BusinessLedgerRepository;
import com.howtodoinjava.demo.repository.LedgerRepo.Impl.BusinessLedgerRepositoryImpl;
import com.howtodoinjava.demo.service.LedgerService.BusinessLedgerService;

import java.util.Set;

public class BusinessLedgerServiceImpl implements BusinessLedgerService {
    private  BusinessLedgerServiceImpl service = null;
    private BusinessLedgerRepository repository;

    private BusinessLedgerServiceImpl(){
        this.repository = BusinessLedgerRepositoryImpl.getRepository();
    }
    public BusinessLedgerServiceImpl getService(){
        if (service == null){
            service = new BusinessLedgerServiceImpl();
        }
        return service;
    }




    public Set<BusinessLedger> getAll() {
        return this.repository.getAll();
    }


    public BusinessLedger create(BusinessLedger busLedger) {
        return this.repository.create(busLedger);
    }


    public BusinessLedger read(String integer) {
        return this.repository.read(integer);
    }


    public BusinessLedger update(BusinessLedger busLedger) {
        return this.repository.update(busLedger);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
