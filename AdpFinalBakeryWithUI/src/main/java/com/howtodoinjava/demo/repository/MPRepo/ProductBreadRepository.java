package com.howtodoinjava.demo.repository.MPRepo;


import com.howtodoinjava.demo.domain.MP.ProductBread;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface ProductBreadRepository extends IRepository<ProductBread, String> {
    Set<ProductBread> getAll();
}