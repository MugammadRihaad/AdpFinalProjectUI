package com.howtodoinjava.demo.service.MPService;


import com.howtodoinjava.demo.domain.MP.ProductBread;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface ProductBreadService extends IService<ProductBread, String> {
    Set<ProductBread> getAll();
}