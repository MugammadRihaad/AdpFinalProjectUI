package com.howtodoinjava.demo.repository.LedgerRepo.Impl;


import com.howtodoinjava.demo.domain.Ledger.GeneralLedger;
import com.howtodoinjava.demo.repository.LedgerRepo.GeneralLedgerRepository;

import java.util.HashSet;
import java.util.Set;

public class GeneralLedgerRepositoryImpl implements GeneralLedgerRepository {
    private static GeneralLedgerRepositoryImpl repository = null;
    private Set<GeneralLedger> genLedger;

    private GeneralLedgerRepositoryImpl(){
        this.genLedger = new HashSet<>();
    }

    public static GeneralLedgerRepositoryImpl getRepository(){
        if (repository == null) repository = new GeneralLedgerRepositoryImpl();
        return repository;
    }


    public GeneralLedger create(GeneralLedger ledger){
        this.genLedger.add(ledger);
        return ledger;
    }

    public GeneralLedger read(String ledgerId){
        return genLedger.stream().filter(ledger -> ledger.getGeneralLId().equals(ledgerId)).findAny().orElse(null);
    }

    public void delete(String ledgerId) {
        GeneralLedger toDelete = read(ledgerId);
        genLedger.remove(toDelete);
    }

    public GeneralLedger update(GeneralLedger ledger){
        GeneralLedger inDelete = read(ledger.getGeneralLId());

        if(inDelete != null){
            genLedger.remove(inDelete);
            genLedger.add(ledger);
            return ledger;
        }

        return null;
    }


    public Set<GeneralLedger> getAll(){
        return this.genLedger;
    }
}
