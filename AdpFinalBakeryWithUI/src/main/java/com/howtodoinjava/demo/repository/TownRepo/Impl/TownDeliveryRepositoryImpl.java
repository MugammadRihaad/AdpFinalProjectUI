package com.howtodoinjava.demo.repository.TownRepo.Impl;


import com.howtodoinjava.demo.domain.Town.TownDelivery;
import com.howtodoinjava.demo.repository.TownRepo.TownDeliveryRepository;

import java.util.HashSet;
import java.util.Set;

public class TownDeliveryRepositoryImpl implements TownDeliveryRepository {
    private static TownDeliveryRepositoryImpl repository = null;
    private Set<TownDelivery> tnDelivery;

    private TownDeliveryRepositoryImpl(){
        this.tnDelivery = new HashSet<>();
    }

    public static TownDeliveryRepositoryImpl getRepository(){
        if (repository == null) repository = new TownDeliveryRepositoryImpl();
        return repository;
    }


    public TownDelivery create(TownDelivery delivery){
        this.tnDelivery.add(delivery);
        return delivery;
    }

    public TownDelivery read(String deliveryId){
        return tnDelivery.stream().filter(delivery -> delivery.getTnDeliveId().equals(deliveryId)).findAny().orElse(null);
    }

    public void delete(String deliveryId) {
        TownDelivery toDelete = read(deliveryId);
        tnDelivery.remove(toDelete);
    }

    public TownDelivery update(TownDelivery delivery){
        TownDelivery toDelete = read(delivery.getTnDeliveId());
        if(toDelete != null) {
            tnDelivery.remove(toDelete);
            tnDelivery.add(delivery);
            return delivery;
        }
        return null;
    }


    public Set<TownDelivery> getAll(){
        return this.tnDelivery;
    }
}
