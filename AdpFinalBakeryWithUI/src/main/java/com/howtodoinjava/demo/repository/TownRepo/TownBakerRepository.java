package com.howtodoinjava.demo.repository.TownRepo;


import com.howtodoinjava.demo.domain.Town.TownBaker;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface TownBakerRepository extends IRepository<TownBaker, String> {
    Set<TownBaker> getAll();
}
