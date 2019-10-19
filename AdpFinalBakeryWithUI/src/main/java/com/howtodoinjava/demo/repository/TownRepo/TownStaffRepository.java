package com.howtodoinjava.demo.repository.TownRepo;


import com.howtodoinjava.demo.domain.Town.TownStaff;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface TownStaffRepository extends IRepository<TownStaff, String> {
    Set<TownStaff> getAll();
}