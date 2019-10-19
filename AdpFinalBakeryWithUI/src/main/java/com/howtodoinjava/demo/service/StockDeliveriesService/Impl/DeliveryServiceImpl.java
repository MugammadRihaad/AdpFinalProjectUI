package com.howtodoinjava.demo.service.StockDeliveriesService.Impl;


import com.howtodoinjava.demo.domain.StockDeliveries.Deliveries;
import com.howtodoinjava.demo.repository.StockDeliveriesRepo.DeliveryRepository;
import com.howtodoinjava.demo.repository.StockDeliveriesRepo.Impl.DeliveryRepositoryImpl;
import com.howtodoinjava.demo.service.StockDeliveriesService.DeliveryService;

import java.util.Set;

public class DeliveryServiceImpl implements DeliveryService {
    private  DeliveryServiceImpl service = null;
    private DeliveryRepository repository;

    private DeliveryServiceImpl(){
        this.repository = DeliveryRepositoryImpl.getRepository();
    }
    public DeliveryServiceImpl getService(){
        if (service == null){
            service = new DeliveryServiceImpl();
        }
        return service;
    }




    public Set<Deliveries> getAll() {
        return this.repository.getAll();
    }


    public Deliveries create(Deliveries deliveries) {
        return this.repository.create(deliveries);
    }


    public Deliveries read(String integer) {
        return this.repository.read(integer);
    }


    public Deliveries update(Deliveries deliveries) {
        return this.repository.update(deliveries);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
