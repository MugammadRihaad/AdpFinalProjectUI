package com.howtodoinjava.demo.service.TownService.Impl;


import com.howtodoinjava.demo.domain.Town.TownAccountant;
import com.howtodoinjava.demo.repository.TownRepo.Impl.TownAccountantRepositoryImpl;
import com.howtodoinjava.demo.repository.TownRepo.TownAccountantRepository;
import com.howtodoinjava.demo.service.TownService.TownAccountantService;

import java.util.Set;

public class TownAccountantServiceImpl implements TownAccountantService {
    private  TownAccountantServiceImpl service = null;
    private TownAccountantRepository repository;

    private TownAccountantServiceImpl(){
        this.repository = TownAccountantRepositoryImpl.getRepository();
    }
    public TownAccountantServiceImpl getService(){
        if (service == null){
            service = new TownAccountantServiceImpl();
        }
        return service;
    }




    public Set<TownAccountant> getAll() {
        return this.repository.getAll();
    }

    public TownAccountant create(TownAccountant accountant) {
        return this.repository.create(accountant);
    }


    public TownAccountant read(String integer) {
        return this.repository.read(integer);
    }


    public TownAccountant update(TownAccountant accountant) {
        return this.repository.update(accountant);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
