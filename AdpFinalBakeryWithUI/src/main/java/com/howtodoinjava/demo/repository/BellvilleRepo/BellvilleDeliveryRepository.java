package com.howtodoinjava.demo.repository.BellvilleRepo;


import com.howtodoinjava.demo.domain.Bellville.BellvilleDelivery;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface BellvilleDeliveryRepository extends IRepository<BellvilleDelivery, String> {
    Set<BellvilleDelivery> getAll();
}
