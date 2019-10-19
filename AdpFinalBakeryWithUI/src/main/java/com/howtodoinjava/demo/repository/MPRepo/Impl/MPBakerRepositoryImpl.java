package com.howtodoinjava.demo.repository.MPRepo.Impl;


import com.howtodoinjava.demo.domain.MP.MPBaker;
import com.howtodoinjava.demo.repository.MPRepo.MPBakerRepository;

import java.util.HashSet;
import java.util.Set;

public class MPBakerRepositoryImpl implements MPBakerRepository {
    private static MPBakerRepositoryImpl repository = null;
    private Set<MPBaker> mpBaker;

    private MPBakerRepositoryImpl(){
        this.mpBaker = new HashSet<>();
    }

    public static MPBakerRepositoryImpl getRepository(){
        if (repository == null) repository = new MPBakerRepositoryImpl();
        return repository;
    }


    public MPBaker create(MPBaker baker){
        this.mpBaker.add(baker);
        return baker;
    }

    public MPBaker read(String bakerId){
        return mpBaker.stream().filter(baker -> baker.getMpBakerId().equals(bakerId)).findAny().orElse(null);
    }

    public void delete(String bakerId) {
        MPBaker toDelete = read(bakerId);
        mpBaker.remove(toDelete);
    }

    public MPBaker update(MPBaker baker){
        MPBaker toDelete = read(baker.getMpBakerId());
        if(toDelete != null) {
            mpBaker.remove(toDelete);
            mpBaker.add(baker);
            return baker;
        }
        return null;
    }


    public Set<MPBaker> getAll(){
        return this.mpBaker;
    }
}
