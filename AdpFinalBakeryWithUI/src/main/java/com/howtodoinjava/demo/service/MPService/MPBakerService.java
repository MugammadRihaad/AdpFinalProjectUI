package com.howtodoinjava.demo.service.MPService;


import com.howtodoinjava.demo.domain.MP.MPBaker;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface MPBakerService extends IService<MPBaker, String> {
    Set<MPBaker> getAll();
}