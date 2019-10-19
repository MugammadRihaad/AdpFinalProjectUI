package com.howtodoinjava.demo.repository.BellvilleRepo;


import com.howtodoinjava.demo.domain.Bellville.BellvilleBranch;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface BellvilleBranchRepository extends IRepository<BellvilleBranch, String> {
    Set<BellvilleBranch> getAll();
}
