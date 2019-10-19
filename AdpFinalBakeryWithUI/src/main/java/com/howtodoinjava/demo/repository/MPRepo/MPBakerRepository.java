package com.howtodoinjava.demo.repository.MPRepo;


import com.howtodoinjava.demo.domain.MP.MPBaker;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface MPBakerRepository extends IRepository<MPBaker, String> {
    Set<MPBaker> getAll();
}