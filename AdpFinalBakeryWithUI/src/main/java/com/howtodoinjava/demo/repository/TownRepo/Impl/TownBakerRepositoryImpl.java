package com.howtodoinjava.demo.repository.TownRepo.Impl;


import com.howtodoinjava.demo.domain.Town.TownBaker;
import com.howtodoinjava.demo.repository.TownRepo.TownBakerRepository;

import java.util.HashSet;
import java.util.Set;

public class TownBakerRepositoryImpl implements TownBakerRepository {
    private static TownBakerRepositoryImpl repository = null;
    private Set<TownBaker> tnBaker;

    private TownBakerRepositoryImpl(){
        this.tnBaker = new HashSet<>();
    }

    public static TownBakerRepositoryImpl getRepository(){
        if (repository == null) repository = new TownBakerRepositoryImpl
    ();
        return repository;
    }


    public TownBaker create(TownBaker baker){
        this.tnBaker.add(baker);
        return baker;
    }

    public TownBaker read(String bakerId){
        return tnBaker.stream().filter(baker -> baker.getTnBakerId().equals(bakerId)).findAny().orElse(null);
    }

    public void delete(String bakerId) {
        TownBaker toDelete = read(bakerId);
        tnBaker.remove(toDelete);
    }

    public TownBaker update(TownBaker baker){
        TownBaker toDelete = read(baker.getTnBakerId());
        if(toDelete != null) {
            tnBaker.remove(toDelete);
            tnBaker.add(baker);
            return baker;
        }
        return null;
    }


    public Set<TownBaker> getAll(){
        return this.tnBaker;
    }
}
