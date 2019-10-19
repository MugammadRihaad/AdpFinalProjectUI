package com.howtodoinjava.demo.service.TownService;


import com.howtodoinjava.demo.domain.Town.TownBranch;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface TownBranchService extends IService<TownBranch, String> {
    Set<TownBranch> getAll();
}
