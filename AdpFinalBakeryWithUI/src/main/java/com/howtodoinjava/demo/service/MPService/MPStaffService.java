package com.howtodoinjava.demo.service.MPService;


import com.howtodoinjava.demo.domain.MP.MPStaff;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface MPStaffService extends IService<MPStaff, String> {
    Set<MPStaff> getAll();
}


