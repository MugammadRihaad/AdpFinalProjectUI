package com.howtodoinjava.demo.service.MPService;


import com.howtodoinjava.demo.domain.MP.MPAccountant;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface MPAccountantService extends IService<MPAccountant, String> {
    Set<MPAccountant> getAll();
}