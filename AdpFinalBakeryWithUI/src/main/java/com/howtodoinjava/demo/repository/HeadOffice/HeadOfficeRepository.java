package com.howtodoinjava.demo.repository.HeadOffice;


import com.howtodoinjava.demo.domain.HeadOffice;
import com.howtodoinjava.demo.repository.IRepository;

import java.util.Set;

public interface HeadOfficeRepository extends IRepository<HeadOffice, String> {
    Set<HeadOffice> getAll();
}
