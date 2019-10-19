package com.howtodoinjava.demo.repository.MPRepo.Impl;


import com.howtodoinjava.demo.domain.MP.MPAccountant;
import com.howtodoinjava.demo.repository.MPRepo.MPAccountantRepository;

import java.util.HashSet;
import java.util.Set;

public class MPAccountantRepositoryImpl implements MPAccountantRepository {
    private static MPAccountantRepositoryImpl repository = null;
    private Set<MPAccountant> mpAccount;

    private MPAccountantRepositoryImpl(){
        this.mpAccount = new HashSet<>();
    }

    public static MPAccountantRepositoryImpl getRepository(){
        if (repository == null) repository = new MPAccountantRepositoryImpl();
        return repository;
    }


    public MPAccountant create(MPAccountant accountant){
        this.mpAccount.add(accountant);
        return accountant;
    }

    public MPAccountant read(String accountantId){
        return mpAccount.stream().filter(accountant -> accountant.getMpAccountId().equals(accountantId)).findAny().orElse(null);
    }

    public void delete(String accountantId) {
        MPAccountant toDelete = read(accountantId);
        mpAccount.remove(toDelete);
    }

    public MPAccountant update(MPAccountant accountant){
        MPAccountant toDelete = read(accountant.getMpAccountId());
        if(toDelete != null) {
            mpAccount.remove(toDelete);
            mpAccount.add(accountant);
            return accountant;
        }
        return null;
    }


    public Set<MPAccountant> getAll(){
        return this.mpAccount;
    }
}
