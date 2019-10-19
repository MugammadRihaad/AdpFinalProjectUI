package com.howtodoinjava.demo.repository.StockDeliveriesRepo.Impl;


import com.howtodoinjava.demo.domain.StockDeliveries.Deliveries;
import com.howtodoinjava.demo.repository.StockDeliveriesRepo.DeliveryRepository;

import java.util.HashSet;
import java.util.Set;

public class DeliveryRepositoryImpl implements DeliveryRepository {
    private static DeliveryRepositoryImpl repository = null;
    private Set<Deliveries> deliveries;

    private DeliveryRepositoryImpl(){
        this.deliveries = new HashSet<>();
    }

    public static DeliveryRepositoryImpl getRepository(){
        if (repository == null) repository = new DeliveryRepositoryImpl();
        return repository;
    }


    public Deliveries create(Deliveries deliv){
        this.deliveries.add(deliv);
        return deliv;
    }

    public Deliveries read(String delivId){
        return deliveries.stream().filter(deliv -> deliv.getDelivId().equals(delivId)).findAny().orElse(null);
    }

    public void delete(String delivId) {
        Deliveries toDelete = read(delivId);
        deliveries.remove(toDelete);
    }

    public Deliveries update(Deliveries delivId){
        Deliveries toDelete = read(delivId.getDelivId());
        if(toDelete != null) {
            deliveries.remove(toDelete);
            deliveries.add(delivId);
            return delivId;
        }
        return null;
    }


    public Set<Deliveries> getAll(){
        return this.deliveries;
    }
}
