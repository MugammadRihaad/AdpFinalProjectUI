package com.howtodoinjava.demo.repository.TownRepo;


import com.howtodoinjava.demo.domain.Town.TownAccountant;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface TownAccountantRepository extends IRepository<TownAccountant, String> {
    Set<TownAccountant> getAll();
}
