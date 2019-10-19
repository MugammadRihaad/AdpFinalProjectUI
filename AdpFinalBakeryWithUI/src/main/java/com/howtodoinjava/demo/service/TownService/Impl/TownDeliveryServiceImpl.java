package com.howtodoinjava.demo.service.TownService.Impl;


import com.howtodoinjava.demo.domain.Town.TownDelivery;
import com.howtodoinjava.demo.repository.TownRepo.Impl.TownDeliveryRepositoryImpl;
import com.howtodoinjava.demo.repository.TownRepo.TownDeliveryRepository;
import com.howtodoinjava.demo.service.TownService.TownDeliveryService;

import java.util.Set;

public class TownDeliveryServiceImpl implements TownDeliveryService {
    private  TownDeliveryServiceImpl service = null;
    private TownDeliveryRepository repository;

    private TownDeliveryServiceImpl(){
        this.repository = TownDeliveryRepositoryImpl.getRepository();
    }
    public TownDeliveryServiceImpl getService(){
        if (service == null){
            service = new TownDeliveryServiceImpl();
        }
        return service;
    }




    public Set<TownDelivery> getAll() {
        return this.repository.getAll();
    }


    public TownDelivery create(TownDelivery delivery) {
        return this.repository.create(delivery);
    }


    public TownDelivery read(String integer) {
        return this.repository.read(integer);
    }


    public TownDelivery update(TownDelivery delivery) {
        return this.repository.update(delivery);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
