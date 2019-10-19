package com.howtodoinjava.demo.repository.BellvilleRepo.Impl;


import com.howtodoinjava.demo.domain.Bellville.BellvilleAccountant;
import com.howtodoinjava.demo.repository.BellvilleRepo.BellvilleAccountantRepository;

import java.util.HashSet;
import java.util.Set;

public class BellvilleAccountantRepoImpl implements BellvilleAccountantRepository {
    private static BellvilleAccountantRepoImpl repository = null;
    private Set<BellvilleAccountant> bellAccount;

    private BellvilleAccountantRepoImpl(){
        bellAccount = new HashSet<>();
    }


    public static BellvilleAccountantRepoImpl getRepository(){
        if (repository == null) {
           return new BellvilleAccountantRepoImpl();
        }
        return repository;
    }


    public BellvilleAccountant create(BellvilleAccountant accountants){
        bellAccount.add(accountants);
        return accountants;
    }

    public BellvilleAccountant read(String account){

        return bellAccount.stream().filter(accountant -> accountant.getBellAccountId().equals(account)).findAny().orElse(null);
    }

    public void delete(String account) {
        BellvilleAccountant toDelete = read(account);
        bellAccount.remove(toDelete);
    }

    public BellvilleAccountant update(BellvilleAccountant accountant){

        BellvilleAccountant toDelete = read(accountant.getBellAccountId());
        if(toDelete != null) {
            bellAccount.remove(toDelete);
            bellAccount.add(accountant);
            return accountant;
        }
        return null;
    }


    public Set<BellvilleAccountant> getAll(){
        return bellAccount;
    }
}
