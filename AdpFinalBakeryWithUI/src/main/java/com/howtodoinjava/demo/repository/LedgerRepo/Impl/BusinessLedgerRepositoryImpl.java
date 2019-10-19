package com.howtodoinjava.demo.repository.LedgerRepo.Impl;


import com.howtodoinjava.demo.domain.Ledger.BusinessLedger;
import com.howtodoinjava.demo.repository.LedgerRepo.BusinessLedgerRepository;

import java.util.HashSet;
import java.util.Set;

public class BusinessLedgerRepositoryImpl implements BusinessLedgerRepository {
    private static BusinessLedgerRepositoryImpl repository = null;
    private Set<BusinessLedger> busLedger;

    private BusinessLedgerRepositoryImpl(){
        this.busLedger = new HashSet<>();
    }

    public static BusinessLedgerRepositoryImpl getRepository(){
        if (repository == null) repository = new BusinessLedgerRepositoryImpl();
        return repository;
    }

    @Override
    public BusinessLedger create(BusinessLedger ledger){
        this.busLedger.add(ledger);
        return ledger;
    }
    @Override
    public BusinessLedger read(String ledgerId){
        return busLedger.stream().filter(ledger -> ledger.getBusniessLId().equals(ledgerId)).findAny().orElse(null);
    }
    @Override
    public void delete(String ledgerId) {
        BusinessLedger toDelete = read(ledgerId);
        busLedger.remove(toDelete);
    }
    @Override
    public BusinessLedger update(BusinessLedger ledger){
        BusinessLedger inDelete = read(ledger.getBusniessLId());

        if(inDelete != null){
            busLedger.remove(inDelete);
            busLedger.add(ledger);
            return ledger;
        }

        return null;
    }

    @Override
    public Set<BusinessLedger> getAll(){
        return this.busLedger;
    }
}
