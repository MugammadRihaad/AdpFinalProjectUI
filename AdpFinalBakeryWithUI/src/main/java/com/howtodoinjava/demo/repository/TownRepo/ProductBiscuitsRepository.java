package com.howtodoinjava.demo.repository.TownRepo;


import com.howtodoinjava.demo.domain.Town.ProductBiscuits;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface ProductBiscuitsRepository extends IRepository<ProductBiscuits, String> {
    Set<ProductBiscuits> getAll();
}