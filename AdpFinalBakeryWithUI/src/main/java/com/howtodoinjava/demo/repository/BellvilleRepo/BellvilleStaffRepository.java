package com.howtodoinjava.demo.repository.BellvilleRepo;


import com.howtodoinjava.demo.domain.Bellville.BellvilleStaff;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface BellvilleStaffRepository extends IRepository<BellvilleStaff, String> {
    Set<BellvilleStaff> getAll();
}
