package com.howtodoinjava.demo.service.MPService.Impl;


import com.howtodoinjava.demo.domain.MP.MPDelivery;
import com.howtodoinjava.demo.repository.MPRepo.Impl.MPDeliveryRepositoryImpl;
import com.howtodoinjava.demo.repository.MPRepo.MPDeliveryRepository;
import com.howtodoinjava.demo.service.MPService.MPDeliveryService;

import java.util.Set;

public class MPDeliveryServiceImpl implements MPDeliveryService {
    private  MPDeliveryServiceImpl service = null;
    private MPDeliveryRepository repository;

    private MPDeliveryServiceImpl(){
        this.repository = MPDeliveryRepositoryImpl.getRepository();
    }
    public MPDeliveryServiceImpl getService(){
        if (service == null){
            service = new MPDeliveryServiceImpl();
        }
        return service;
    }




    public Set<MPDelivery> getAll() {
        return this.repository.getAll();
    }


    public MPDelivery create(MPDelivery delivery) {
        return this.repository.create(delivery);
    }


    public MPDelivery read(String integer) {
        return this.repository.read(integer);
    }


    public MPDelivery update(MPDelivery delivery) {
        return this.repository.update(delivery);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
