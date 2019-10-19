package com.howtodoinjava.demo.service.BellvilleService;


import com.howtodoinjava.demo.domain.Bellville.BellvilleStaff;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface BellvilleStaffService extends IService<BellvilleStaff, String> {
    Set<BellvilleStaff> getAll();
}