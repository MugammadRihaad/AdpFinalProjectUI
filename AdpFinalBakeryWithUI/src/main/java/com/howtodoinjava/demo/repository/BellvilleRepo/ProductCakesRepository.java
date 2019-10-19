package com.howtodoinjava.demo.repository.BellvilleRepo;


import com.howtodoinjava.demo.domain.Bellville.ProductCakes;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface ProductCakesRepository extends IRepository<ProductCakes, String> {
    Set<ProductCakes> getAll();
}
