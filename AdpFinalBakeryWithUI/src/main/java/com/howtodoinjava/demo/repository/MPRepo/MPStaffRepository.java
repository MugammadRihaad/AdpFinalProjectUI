package com.howtodoinjava.demo.repository.MPRepo;


import com.howtodoinjava.demo.domain.MP.MPStaff;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface MPStaffRepository extends IRepository<MPStaff, String> {
    Set<MPStaff> getAll();
}

