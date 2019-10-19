package com.howtodoinjava.demo.service.MPService;


import com.howtodoinjava.demo.domain.MP.MPBranch;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface MPBranchService extends IService<MPBranch, String> {
    Set<MPBranch> getAll();
}