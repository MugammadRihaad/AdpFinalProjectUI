package com.howtodoinjava.demo.repository.TownRepo.Impl;


import com.howtodoinjava.demo.domain.Town.TownAccountant;
import com.howtodoinjava.demo.repository.TownRepo.TownAccountantRepository;

import java.util.HashSet;
import java.util.Set;

public class TownAccountantRepositoryImpl implements TownAccountantRepository {
    private static TownAccountantRepositoryImpl repository = null;
    private Set<TownAccountant> tnAccount;

    private TownAccountantRepositoryImpl(){
        this.tnAccount = new HashSet<>();
    }

    public static TownAccountantRepositoryImpl getRepository(){
        if (repository == null) repository = new TownAccountantRepositoryImpl();
        return repository;
    }


    public TownAccountant create(TownAccountant accountant){
        this.tnAccount.add(accountant);
        return accountant;
    }

    public TownAccountant read(String accountantId){
        return tnAccount.stream().filter(accountant -> accountant.getTnAccountId().equals(accountantId)).findAny().orElse(null);
    }

    public void delete(String accountantId) {
        TownAccountant toDelete = read(accountantId);
        tnAccount.remove(toDelete);
    }

    public TownAccountant update(TownAccountant accountant){
        TownAccountant toDelete = read(accountant.getTnAccountId());
        if(toDelete != null) {
            tnAccount.remove(toDelete);
            tnAccount.add(accountant);
            return accountant;
        }
        return null;
    }


    public Set<TownAccountant> getAll(){
        return this.tnAccount;
    }
}
