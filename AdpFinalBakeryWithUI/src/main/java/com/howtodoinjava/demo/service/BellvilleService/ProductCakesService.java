package com.howtodoinjava.demo.service.BellvilleService;


import com.howtodoinjava.demo.domain.Bellville.ProductCakes;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface ProductCakesService extends IService<ProductCakes, String> {
    Set<ProductCakes> getAll();
}
