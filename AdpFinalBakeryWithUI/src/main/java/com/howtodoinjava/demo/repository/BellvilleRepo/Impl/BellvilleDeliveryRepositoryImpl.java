package com.howtodoinjava.demo.repository.BellvilleRepo.Impl;


import com.howtodoinjava.demo.domain.Bellville.BellvilleDelivery;
import com.howtodoinjava.demo.repository.BellvilleRepo.BellvilleDeliveryRepository;

import java.util.HashSet;
import java.util.Set;

public class BellvilleDeliveryRepositoryImpl implements BellvilleDeliveryRepository {
    private static BellvilleDeliveryRepositoryImpl repository = null;
    private Set<BellvilleDelivery> bellDelivery;

    private BellvilleDeliveryRepositoryImpl(){
        this.bellDelivery = new HashSet<>();
    }

    public static BellvilleDeliveryRepositoryImpl getRepository(){
        if (repository == null) repository = new BellvilleDeliveryRepositoryImpl();
        return repository;
    }


    public BellvilleDelivery create(BellvilleDelivery delivery){
        this.bellDelivery.add(delivery);
        return delivery;
    }

    public BellvilleDelivery read(String deliveryId){
        return bellDelivery.stream().filter(delivery -> delivery.getBellDeliveId().equals(deliveryId)).findAny().orElse(null);
    }

    public void delete(String deliveryId) {
        BellvilleDelivery inDelete=read(deliveryId);
        bellDelivery.remove(inDelete);
    }

    public BellvilleDelivery update(BellvilleDelivery delivery){
        BellvilleDelivery inDelete = read(delivery.getBellDeliveId());

        if(inDelete != null){
            bellDelivery.remove(inDelete);
            bellDelivery.add(delivery);
            return delivery;
        }

        return null;
    }

    @Override
    public Set<BellvilleDelivery> getAll(){
        return this.bellDelivery;
    }
}
