package com.howtodoinjava.demo.service.MPService.Impl;


import com.howtodoinjava.demo.domain.MP.MPBaker;
import com.howtodoinjava.demo.repository.MPRepo.Impl.MPBakerRepositoryImpl;
import com.howtodoinjava.demo.repository.MPRepo.MPBakerRepository;
import com.howtodoinjava.demo.service.MPService.MPBakerService;

import java.util.Set;

public class MPBakerServiceImpl implements MPBakerService {
    private  MPBakerServiceImpl service = null;
    private MPBakerRepository repository;

    private MPBakerServiceImpl(){
        this.repository = MPBakerRepositoryImpl.getRepository();
    }
    public MPBakerServiceImpl getService(){
        if (service == null){
            service = new MPBakerServiceImpl();
        }
        return service;
    }




    public Set<MPBaker> getAll() {
        return this.repository.getAll();
    }


    public MPBaker create(MPBaker baker) {
        return this.repository.create(baker);
    }


    public MPBaker read(String integer) {
        return this.repository.read(integer);
    }


    public MPBaker update(MPBaker baker) {
        return this.repository.update(baker);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}

