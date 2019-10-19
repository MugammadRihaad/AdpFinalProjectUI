package com.howtodoinjava.demo.service.TownService.Impl;


import com.howtodoinjava.demo.domain.Town.TownBaker;
import com.howtodoinjava.demo.repository.TownRepo.Impl.TownBakerRepositoryImpl;
import com.howtodoinjava.demo.repository.TownRepo.TownBakerRepository;
import com.howtodoinjava.demo.service.TownService.TownBakerService;

import java.util.Set;

public class TownBakerServiceImpl implements TownBakerService {
    private  TownBakerServiceImpl service = null;
    private TownBakerRepository repository;

    private TownBakerServiceImpl(){
        this.repository = TownBakerRepositoryImpl.getRepository();
    }
    public TownBakerServiceImpl getService(){
        if (service == null){
            service = new TownBakerServiceImpl();
        }
        return service;
    }




    public Set<TownBaker> getAll() {
        return this.repository.getAll();
    }


    public TownBaker create(TownBaker baker) {
        return this.repository.create(baker);
    }


    public TownBaker read(String integer) {
        return this.repository.read(integer);
    }


    public TownBaker update(TownBaker baker) {
        return this.repository.update(baker);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
