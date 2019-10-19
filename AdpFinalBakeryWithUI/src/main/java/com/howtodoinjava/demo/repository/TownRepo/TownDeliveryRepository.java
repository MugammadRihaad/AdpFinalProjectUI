package com.howtodoinjava.demo.repository.TownRepo;


import com.howtodoinjava.demo.domain.Town.TownDelivery;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface TownDeliveryRepository extends IRepository<TownDelivery, String> {
    Set<TownDelivery> getAll();
}
