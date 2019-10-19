package com.howtodoinjava.demo.repository.LedgerRepo.Impl;


import com.howtodoinjava.demo.domain.Ledger.CreditorsLedger;
import com.howtodoinjava.demo.repository.LedgerRepo.CreditorsLedgerRepository;

import java.util.HashSet;
import java.util.Set;

public class CreditorsLedgerRepositoryImpl implements CreditorsLedgerRepository {
    private static CreditorsLedgerRepositoryImpl repository = null;
    private Set<CreditorsLedger> credLedger;

    private CreditorsLedgerRepositoryImpl(){
        this.credLedger = new HashSet<>();
    }

    public static CreditorsLedgerRepositoryImpl getRepository(){
        if (repository == null) repository = new CreditorsLedgerRepositoryImpl();
        return repository;
    }


    public CreditorsLedger create(CreditorsLedger ledger){
        this.credLedger.add(ledger);
        return ledger;
    }

    public CreditorsLedger read(String ledgerId){
        return credLedger.stream().filter(ledger -> ledger.getCreditorsLId().equals(ledgerId)).findAny().orElse(null);
    }

    public void delete(String ledgerId) {
        CreditorsLedger toDelete = read(ledgerId);
        credLedger.remove(toDelete);
    }

    public CreditorsLedger update(CreditorsLedger ledger){
        CreditorsLedger inDelete = read(ledger.getCreditorsLId());

        if(inDelete != null){
            credLedger.remove(inDelete);
            credLedger.add(ledger);
            return ledger;
        }

        return null;
    }


    public Set<CreditorsLedger> getAll(){
        return this.credLedger;
    }
}
