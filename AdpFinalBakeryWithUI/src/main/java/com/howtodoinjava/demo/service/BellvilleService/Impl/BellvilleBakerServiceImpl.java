package com.howtodoinjava.demo.service.BellvilleService.Impl;


import com.howtodoinjava.demo.domain.Bellville.bellvilleBaker;
import com.howtodoinjava.demo.repository.BellvilleRepo.BellvilleBakerRepository;
import com.howtodoinjava.demo.repository.BellvilleRepo.Impl.BellvilleBakerRepositoryImpl;
import com.howtodoinjava.demo.service.BellvilleService.BellvilleBakerService;

import java.util.Set;

public class BellvilleBakerServiceImpl implements BellvilleBakerService {
    private  BellvilleBakerServiceImpl service = null;
    private BellvilleBakerRepository repository;

    private BellvilleBakerServiceImpl(){
        this.repository = BellvilleBakerRepositoryImpl.getRepository();
    }
    public BellvilleBakerServiceImpl getService(){
        if (service == null){
            service = new BellvilleBakerServiceImpl();
        }
        return service;
    }




    public Set<bellvilleBaker> getAll() {
        return this.repository.getAll();
    }


    public bellvilleBaker create(bellvilleBaker baker) {
        return this.repository.create(baker);
    }


    public bellvilleBaker read(String integer) {
        return this.repository.read(integer);
    }


    public bellvilleBaker update(bellvilleBaker baker) {
        return this.repository.update(baker);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
