package com.howtodoinjava.demo.repository.BellvilleRepo;


import com.howtodoinjava.demo.domain.Bellville.BellvilleAccountant;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface  BellvilleAccountantRepository extends IRepository<BellvilleAccountant, String> {
    Set<BellvilleAccountant> getAll();
}
