package com.howtodoinjava.demo.service.MPService;


import com.howtodoinjava.demo.domain.MP.MPDelivery;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface MPDeliveryService extends IService<MPDelivery, String> {
    Set<MPDelivery> getAll();
}