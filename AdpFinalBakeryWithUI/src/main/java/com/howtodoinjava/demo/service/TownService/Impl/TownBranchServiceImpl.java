package com.howtodoinjava.demo.service.TownService.Impl;


import com.howtodoinjava.demo.domain.Town.TownBranch;
import com.howtodoinjava.demo.repository.TownRepo.Impl.TownBranchRepositoryImpl;
import com.howtodoinjava.demo.repository.TownRepo.TownBranchRepository;
import com.howtodoinjava.demo.service.TownService.TownBranchService;

import java.util.Set;

public class TownBranchServiceImpl implements TownBranchService {
    private  TownBranchServiceImpl service = null;
    private TownBranchRepository repository;

    private TownBranchServiceImpl(){
        this.repository = TownBranchRepositoryImpl.getRepository();
    }
    public TownBranchServiceImpl getService(){
        if (service == null){
            service = new TownBranchServiceImpl();
        }
        return service;
    }




    public Set<TownBranch> getAll() {
        return this.repository.getAll();
    }


    public TownBranch create(TownBranch branch) {
        return this.repository.create(branch);
    }


    public TownBranch read(String integer) {
        return this.repository.read(integer);
    }


    public TownBranch update(TownBranch branch) {
        return this.repository.update(branch);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
