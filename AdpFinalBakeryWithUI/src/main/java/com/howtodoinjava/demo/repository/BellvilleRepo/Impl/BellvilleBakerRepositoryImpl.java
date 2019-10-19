package com.howtodoinjava.demo.repository.BellvilleRepo.Impl;


import com.howtodoinjava.demo.domain.Bellville.bellvilleBaker;
import com.howtodoinjava.demo.repository.BellvilleRepo.BellvilleBakerRepository;

import java.util.HashSet;
import java.util.Set;

public class BellvilleBakerRepositoryImpl implements BellvilleBakerRepository {
    private static BellvilleBakerRepositoryImpl repository = null;
    private Set<bellvilleBaker> bellBaker;

    private BellvilleBakerRepositoryImpl(){
        this.bellBaker = new HashSet<>();
    }

    public static BellvilleBakerRepositoryImpl getRepository(){
        if (repository == null) repository = new BellvilleBakerRepositoryImpl();
        return repository;
    }


    public bellvilleBaker create(bellvilleBaker baker){
        this.bellBaker.add(baker);
        return baker;
    }

    public bellvilleBaker read(String bakerId){
        return bellBaker.stream().filter(baker -> baker.getBellBakerId().equals(bakerId)).findAny().orElse(null);
    }

    public void delete(String bakerId) {
        bellvilleBaker inDelete=read(bakerId);
        bellBaker.remove(inDelete);
    }

    public bellvilleBaker update(bellvilleBaker baker){
        bellvilleBaker inDelete = read(baker.getBellBakerId());

        if(inDelete != null){
            bellBaker.remove(inDelete);
            bellBaker.add(baker);
            return baker;
        }

        return null;
    }


    public Set<bellvilleBaker> getAll(){
        return this.bellBaker;
    }
}
