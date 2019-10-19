package com.howtodoinjava.demo.repository.MPRepo;


import com.howtodoinjava.demo.domain.MP.MPDelivery;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface MPDeliveryRepository extends IRepository<MPDelivery, String> {
    Set<MPDelivery> getAll();
}