package com.howtodoinjava.demo.service.HeadOfficeService;


import com.howtodoinjava.demo.domain.HeadOffice;
import com.howtodoinjava.demo.service.IService;

import java.util.Set;

public interface HeadOfficeService extends IService<HeadOffice, String> {
    Set<HeadOffice> getAll();
}