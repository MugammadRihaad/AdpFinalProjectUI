package com.howtodoinjava.demo.repository.LedgerRepo.Impl;


import com.howtodoinjava.demo.domain.Ledger.Ledger;
import com.howtodoinjava.demo.repository.LedgerRepo.LedgerRepository;

import java.util.HashSet;
import java.util.Set;

public class LedgerRepositoryImpl implements LedgerRepository {
    private static LedgerRepositoryImpl repository = null;
    private Set<Ledger> ledg;

    private LedgerRepositoryImpl(){
        this.ledg = new HashSet<>();
    }

    public static LedgerRepositoryImpl getRepository(){
        if (repository == null) repository = new LedgerRepositoryImpl();
        return repository;
    }


    public Ledger create(Ledger ledger){
        this.ledg.add(ledger);
        return ledger;
    }

    public Ledger read(String ledgerId){
        return ledg.stream().filter(ledger -> ledger.getLedgerId().equals(ledgerId)).findAny().orElse(null);
    }

    public void delete(String ledgerId) {
        Ledger toDelete = read(ledgerId);
        ledg.remove(toDelete);
    }

    public Ledger update(Ledger ledger){
        Ledger inDelete = read(ledger.getLedgerId());

        if(inDelete != null){
            ledg.remove(inDelete);
            ledg.add(ledger);
            return ledger;
        }

        return null;
    }


    public Set<Ledger> getAll(){
        return this.ledg;
    }
}
