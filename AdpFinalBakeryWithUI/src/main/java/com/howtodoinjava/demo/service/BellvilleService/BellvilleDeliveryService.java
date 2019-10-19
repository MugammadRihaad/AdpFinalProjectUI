package com.howtodoinjava.demo.service.BellvilleService;


import com.howtodoinjava.demo.domain.Bellville.BellvilleDelivery;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface BellvilleDeliveryService extends IService<BellvilleDelivery, String> {
    Set<BellvilleDelivery> getAll();
}
