package com.howtodoinjava.demo.repository.TownRepo.Impl;


import com.howtodoinjava.demo.domain.Town.TownBranch;
import com.howtodoinjava.demo.repository.TownRepo.TownBranchRepository;

import java.util.HashSet;
import java.util.Set;

public class TownBranchRepositoryImpl implements TownBranchRepository {
    private static TownBranchRepositoryImpl repository = null;
    private Set<TownBranch> tnBranch;

    private TownBranchRepositoryImpl(){
        this.tnBranch = new HashSet<>();
    }

    public static TownBranchRepositoryImpl getRepository(){
        if (repository == null) repository = new TownBranchRepositoryImpl();
        return repository;
    }


    public TownBranch create(TownBranch branch){
        this.tnBranch.add(branch);
        return branch;
    }

    public TownBranch read(String branchId){
        return tnBranch.stream().filter(branch -> branch.getTnBrId().equals(branchId)).findAny().orElse(null);
    }

    public void delete(String branchId) {
        TownBranch toDelete = read(branchId);
        tnBranch.remove(toDelete);
    }

    public TownBranch update(TownBranch branch){
        TownBranch toDelete = read(branch.getTnBrId());
        if(toDelete != null) {
            tnBranch.remove(toDelete);
            tnBranch.add(branch);
            return branch;
        }
        return null;
    }


    public Set<TownBranch> getAll(){
        return this.tnBranch;
    }
}
