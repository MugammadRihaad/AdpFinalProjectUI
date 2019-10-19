package com.howtodoinjava.demo.repository.MPRepo.Impl;


import com.howtodoinjava.demo.domain.MP.MPBranch;
import com.howtodoinjava.demo.repository.MPRepo.MPBranchRepository;

import java.util.HashSet;
import java.util.Set;

public class MPBranchRepositoryImpl implements MPBranchRepository {
    private static MPBranchRepositoryImpl repository = null;
    private Set<MPBranch> mpBranch;

    private MPBranchRepositoryImpl(){
        this.mpBranch = new HashSet<>();
    }

    public static MPBranchRepositoryImpl getRepository(){
        if (repository == null) repository = new MPBranchRepositoryImpl();
        return repository;
    }


    public MPBranch create(MPBranch branch){
        this.mpBranch.add(branch);
        return branch;
    }

    public MPBranch read(String branchId){
        return mpBranch.stream().filter(branch -> branch.getMpBrId().equals(branchId)).findAny().orElse(null);
    }

    public void delete(String branchId) {
        MPBranch toDelete = read(branchId);
        mpBranch.remove(toDelete);
    }

    public MPBranch update(MPBranch branch){
        MPBranch toDelete = read(branch.getMpBrId());
        if(toDelete != null) {
            mpBranch.remove(toDelete);
            mpBranch.add(branch);
            return branch;
        }
        return null;
    }


    public Set<MPBranch> getAll(){
        return this.mpBranch;
    }
}
