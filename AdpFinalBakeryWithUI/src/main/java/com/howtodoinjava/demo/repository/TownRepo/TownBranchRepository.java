package com.howtodoinjava.demo.repository.TownRepo;


import com.howtodoinjava.demo.domain.Town.TownBranch;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface TownBranchRepository extends IRepository<TownBranch, String> {
    Set<TownBranch> getAll();
}
