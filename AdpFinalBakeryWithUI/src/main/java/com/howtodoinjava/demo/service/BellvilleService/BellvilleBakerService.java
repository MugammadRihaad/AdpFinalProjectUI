package com.howtodoinjava.demo.service.BellvilleService;


import com.howtodoinjava.demo.domain.Bellville.bellvilleBaker;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface  BellvilleBakerService extends IService<bellvilleBaker, String> {
    Set<bellvilleBaker> getAll();
}
