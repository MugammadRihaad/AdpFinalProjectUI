package com.howtodoinjava.demo.repository.MPRepo;


import com.howtodoinjava.demo.domain.MP.MPBranch;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface MPBranchRepository extends IRepository<MPBranch, String> {
    Set<MPBranch> getAll();
}
