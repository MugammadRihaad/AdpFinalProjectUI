package com.howtodoinjava.demo.service.TownService;


import com.howtodoinjava.demo.domain.Town.TownBaker;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface TownBakerService extends IService<TownBaker, String> {
    Set<TownBaker> getAll();
}
