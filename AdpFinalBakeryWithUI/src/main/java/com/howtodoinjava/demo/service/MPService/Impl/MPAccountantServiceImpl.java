package com.howtodoinjava.demo.service.MPService.Impl;


import com.howtodoinjava.demo.domain.MP.MPAccountant;
import com.howtodoinjava.demo.repository.MPRepo.Impl.MPAccountantRepositoryImpl;
import com.howtodoinjava.demo.repository.MPRepo.MPAccountantRepository;
import com.howtodoinjava.demo.service.MPService.MPAccountantService;

import java.util.Set;

public class MPAccountantServiceImpl implements MPAccountantService {
    private  MPAccountantServiceImpl service = null;
    private MPAccountantRepository repository;

    private MPAccountantServiceImpl(){
        this.repository = MPAccountantRepositoryImpl.getRepository();
    }
    public MPAccountantServiceImpl getService(){
        if (service == null){
            service = new MPAccountantServiceImpl();
        }
        return service;
    }




    public Set<MPAccountant> getAll() {
        return this.repository.getAll();
    }


    public MPAccountant create(MPAccountant accountant) {
        return this.repository.create(accountant);
    }


    public MPAccountant read(String integer) {
        return this.repository.read(integer);
    }


    public MPAccountant update(MPAccountant accountant) {
        return this.repository.update(accountant);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
