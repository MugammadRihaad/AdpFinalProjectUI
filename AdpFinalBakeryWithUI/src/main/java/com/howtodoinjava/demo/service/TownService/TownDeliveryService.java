package com.howtodoinjava.demo.service.TownService;


import com.howtodoinjava.demo.domain.Town.TownDelivery;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface TownDeliveryService extends IService<TownDelivery, String> {
    Set<TownDelivery> getAll();
}
