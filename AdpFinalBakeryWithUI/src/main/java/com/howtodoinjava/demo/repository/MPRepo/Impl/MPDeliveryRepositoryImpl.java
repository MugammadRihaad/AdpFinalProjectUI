package com.howtodoinjava.demo.repository.MPRepo.Impl;


import com.howtodoinjava.demo.domain.MP.MPDelivery;
import com.howtodoinjava.demo.repository.MPRepo.MPDeliveryRepository;

import java.util.HashSet;
import java.util.Set;

public class MPDeliveryRepositoryImpl implements MPDeliveryRepository {
    private static MPDeliveryRepositoryImpl repository = null;
    private Set<MPDelivery> mpDelivery;

    private MPDeliveryRepositoryImpl(){
        this.mpDelivery = new HashSet<>();
    }

    public static MPDeliveryRepositoryImpl getRepository(){
        if (repository == null) repository = new MPDeliveryRepositoryImpl();
        return repository;
    }


    public MPDelivery create(MPDelivery delivery){
        this.mpDelivery.add(delivery);
        return delivery;
    }

    public MPDelivery read(String deliveryId){
        return mpDelivery.stream().filter(delivery -> delivery.getMpDeliveId().equals(deliveryId)).findAny().orElse(null);
    }

    public void delete(String deliveryId) {
        MPDelivery toDelete = read(deliveryId);
        mpDelivery.remove(toDelete);
    }

    public MPDelivery update(MPDelivery delivery){
        MPDelivery toDelete = read(delivery.getMpDeliveId());
        if(toDelete != null) {
            mpDelivery.remove(toDelete);
            mpDelivery.add(delivery);
            return delivery;
        }
        return null;
    }


    public Set<MPDelivery> getAll(){
        return this.mpDelivery;
    }
}
