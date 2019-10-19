package com.howtodoinjava.demo.repository.MPRepo;


import com.howtodoinjava.demo.domain.MP.MPAccountant;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface MPAccountantRepository extends IRepository<MPAccountant, String> {
    Set<MPAccountant> getAll();
}
