package com.howtodoinjava.demo.repository.BellvilleRepo;


import com.howtodoinjava.demo.domain.Bellville.bellvilleBaker;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface BellvilleBakerRepository extends IRepository<bellvilleBaker, String> {
    Set<bellvilleBaker> getAll();
}