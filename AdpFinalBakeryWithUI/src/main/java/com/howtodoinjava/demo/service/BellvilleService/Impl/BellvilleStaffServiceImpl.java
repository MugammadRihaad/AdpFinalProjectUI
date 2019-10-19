package com.howtodoinjava.demo.service.BellvilleService.Impl;


import com.howtodoinjava.demo.domain.Bellville.BellvilleStaff;
import com.howtodoinjava.demo.repository.BellvilleRepo.BellvilleStaffRepository;
import com.howtodoinjava.demo.repository.BellvilleRepo.Impl.BellvilleStaffRepositoryImpl;
import com.howtodoinjava.demo.service.BellvilleService.BellvilleStaffService;

import java.util.Set;

public class BellvilleStaffServiceImpl implements BellvilleStaffService {
    private  BellvilleStaffServiceImpl service = null;
    private BellvilleStaffRepository repository;

    private BellvilleStaffServiceImpl(){
        this.repository = BellvilleStaffRepositoryImpl.getRepository();
    }
    public BellvilleStaffServiceImpl getService(){
        if (service == null){
            service = new BellvilleStaffServiceImpl();
        }
        return service;
    }




    public Set<BellvilleStaff> getAll() {
        return this.repository.getAll();
    }


    public BellvilleStaff create(BellvilleStaff staff) {
        return this.repository.create(staff);
    }


    public BellvilleStaff read(String integer) {
        return this.repository.read(integer);
    }


    public BellvilleStaff update(BellvilleStaff staff) {
        return this.repository.update(staff);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
