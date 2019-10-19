package com.howtodoinjava.demo.service.MPService.Impl;


import com.howtodoinjava.demo.domain.MP.MPStaff;
import com.howtodoinjava.demo.repository.MPRepo.Impl.MPStaffRepositoryImpl;
import com.howtodoinjava.demo.repository.MPRepo.MPStaffRepository;
import com.howtodoinjava.demo.service.MPService.MPStaffService;

import java.util.Set;

public class MPStaffServiceImpl implements MPStaffService {
    private  MPStaffServiceImpl service = null;
    private MPStaffRepository repository;

    private MPStaffServiceImpl(){
        this.repository = MPStaffRepositoryImpl.getRepository();
    }
    public MPStaffServiceImpl getService(){
        if (service == null){
            service = new MPStaffServiceImpl();
        }
        return service;
    }




    public Set<MPStaff> getAll() {
        return this.repository.getAll();
    }


    public MPStaff create(MPStaff staff) {
        return this.repository.create(staff);
    }


    public MPStaff read(String integer) {
        return this.repository.read(integer);
    }


    public MPStaff update(MPStaff staff) {
        return this.repository.update(staff);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
