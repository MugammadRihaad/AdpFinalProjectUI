package com.howtodoinjava.demo.service.BellvilleService.Impl;


import com.howtodoinjava.demo.domain.Bellville.BellvilleBranch;
import com.howtodoinjava.demo.repository.BellvilleRepo.BellvilleBranchRepository;
import com.howtodoinjava.demo.repository.BellvilleRepo.Impl.BellvilleBranchRepositoryImpl;
import com.howtodoinjava.demo.service.BellvilleService.BellvilleBranchService;

import java.util.Set;

public class BellvilleBranchServiceImpl implements BellvilleBranchService {
    private  BellvilleBranchServiceImpl service = null;
    private BellvilleBranchRepository repository;

    private BellvilleBranchServiceImpl(){
        this.repository = BellvilleBranchRepositoryImpl.getRepository();
    }
    public BellvilleBranchServiceImpl getService(){
        if (service == null){
            service = new BellvilleBranchServiceImpl();
        }
        return service;
    }




    public Set<BellvilleBranch> getAll() {
        return this.repository.getAll();
    }

    public BellvilleBranch create(BellvilleBranch branch) {
        return this.repository.create(branch);
    }


    public BellvilleBranch read(String integer) {
        return this.repository.read(integer);
    }


    public BellvilleBranch update(BellvilleBranch branch) {
        return this.repository.update(branch);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
