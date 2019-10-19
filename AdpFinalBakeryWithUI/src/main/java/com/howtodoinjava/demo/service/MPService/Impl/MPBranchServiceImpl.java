package com.howtodoinjava.demo.service.MPService.Impl;


import com.howtodoinjava.demo.domain.MP.MPBranch;
import com.howtodoinjava.demo.repository.MPRepo.Impl.MPBranchRepositoryImpl;
import com.howtodoinjava.demo.repository.MPRepo.MPBranchRepository;
import com.howtodoinjava.demo.service.MPService.MPBranchService;

import java.util.Set;

public class MPBranchServiceImpl implements MPBranchService {
    private  MPBranchServiceImpl service = null;
    private MPBranchRepository repository;

    private MPBranchServiceImpl(){
        this.repository = MPBranchRepositoryImpl.getRepository();
    }
    public MPBranchServiceImpl getService(){
        if (service == null){
            service = new MPBranchServiceImpl();
        }
        return service;
    }




    public Set<MPBranch> getAll() {
        return this.repository.getAll();
    }


    public MPBranch create(MPBranch branch) {
        return this.repository.create(branch);
    }


    public MPBranch read(String integer) {
        return this.repository.read(integer);
    }


    public MPBranch update(MPBranch branch) {
        return this.repository.update(branch);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
