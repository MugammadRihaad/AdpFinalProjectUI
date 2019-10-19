package com.howtodoinjava.demo.service.BellvilleService;


import com.howtodoinjava.demo.domain.Bellville.BellvilleBranch;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface BellvilleBranchService extends IService<BellvilleBranch, String> {
    Set<BellvilleBranch> getAll();
}