package com.howtodoinjava.demo.service.TownService;


import com.howtodoinjava.demo.domain.Town.TownStaff;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface TownStaffService extends IService<TownStaff, String> {
    Set<TownStaff> getAll();
}