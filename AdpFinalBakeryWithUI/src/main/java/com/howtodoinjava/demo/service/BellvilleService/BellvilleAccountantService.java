package com.howtodoinjava.demo.service.BellvilleService;

import com.howtodoinjava.demo.domain.Bellville.BellvilleAccountant;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface  BellvilleAccountantService extends IService<BellvilleAccountant, String> {
    Set<BellvilleAccountant> getAll();
}
