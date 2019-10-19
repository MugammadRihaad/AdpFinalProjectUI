package com.howtodoinjava.demo.service.BellvilleService.Impl;


import com.howtodoinjava.demo.domain.Bellville.BellvilleDelivery;
import com.howtodoinjava.demo.repository.BellvilleRepo.BellvilleDeliveryRepository;
import com.howtodoinjava.demo.repository.BellvilleRepo.Impl.BellvilleDeliveryRepositoryImpl;
import com.howtodoinjava.demo.service.BellvilleService.BellvilleDeliveryService;

import java.util.Set;


public class BellvilleDeliveryServiceImpl implements BellvilleDeliveryService {
    private  BellvilleDeliveryServiceImpl service = null;
    private BellvilleDeliveryRepository repository;

    private BellvilleDeliveryServiceImpl(){
        this.repository = BellvilleDeliveryRepositoryImpl.getRepository();
    }
    public BellvilleDeliveryServiceImpl getService(){
        if (service == null){
            service = new BellvilleDeliveryServiceImpl();
        }
        return service;
    }




    public Set<BellvilleDelivery> getAll() {
        return this.repository.getAll();
    }


    public BellvilleDelivery create(BellvilleDelivery delivery) {
        return this.repository.create(delivery);
    }


    public BellvilleDelivery read(String integer) {
        return this.repository.read(integer);
    }


    public BellvilleDelivery update(BellvilleDelivery delivery) {
        return this.repository.update(delivery);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
