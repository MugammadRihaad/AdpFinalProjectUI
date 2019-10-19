package com.howtodoinjava.demo.service.TownService;


import com.howtodoinjava.demo.domain.Town.ProductBiscuits;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface ProductBiscuitsService extends IService<ProductBiscuits, String> {
    Set<ProductBiscuits> getAll();
}