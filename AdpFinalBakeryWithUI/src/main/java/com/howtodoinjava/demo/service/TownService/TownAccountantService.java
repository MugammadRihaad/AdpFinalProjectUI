package com.howtodoinjava.demo.service.TownService;


import com.howtodoinjava.demo.domain.Town.TownAccountant;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface TownAccountantService extends IService<TownAccountant, String> {
    Set<TownAccountant> getAll();
}