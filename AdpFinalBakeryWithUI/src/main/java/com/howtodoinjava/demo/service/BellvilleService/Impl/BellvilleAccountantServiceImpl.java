package com.howtodoinjava.demo.service.BellvilleService.Impl;



import com.howtodoinjava.demo.domain.Bellville.BellvilleAccountant;
import com.howtodoinjava.demo.repository.BellvilleRepo.BellvilleAccountantRepository;
import com.howtodoinjava.demo.repository.BellvilleRepo.Impl.BellvilleAccountantRepoImpl;
import com.howtodoinjava.demo.service.BellvilleService.BellvilleAccountantService;

import java.util.Set;


public class BellvilleAccountantServiceImpl implements BellvilleAccountantService {
    private  BellvilleAccountantServiceImpl service = null;
    private BellvilleAccountantRepository repository;

    private BellvilleAccountantServiceImpl(){
        this.repository = BellvilleAccountantRepoImpl.getRepository();
    }
    public BellvilleAccountantServiceImpl getService(){
        if (service == null){
            service = new BellvilleAccountantServiceImpl();
        }
        return service;
    }




    public Set<BellvilleAccountant> getAll() {
        return this.repository.getAll();
    }


    public BellvilleAccountant create(BellvilleAccountant accountant) {
        return this.repository.create(accountant);
    }


    public BellvilleAccountant read(String integer) {
        return this.repository.read(integer);
    }


    public BellvilleAccountant update(BellvilleAccountant accountant) {
        return this.repository.update(accountant);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
