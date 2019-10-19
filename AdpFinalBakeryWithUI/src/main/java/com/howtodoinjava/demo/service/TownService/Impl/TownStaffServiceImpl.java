package com.howtodoinjava.demo.service.TownService.Impl;


import com.howtodoinjava.demo.domain.Town.TownStaff;
import com.howtodoinjava.demo.repository.TownRepo.Impl.TownStaffRepositoryImpl;
import com.howtodoinjava.demo.repository.TownRepo.TownStaffRepository;
import com.howtodoinjava.demo.service.TownService.TownStaffService;

import java.util.Set;

public class TownStaffServiceImpl implements TownStaffService {
    private  TownStaffServiceImpl service = null;
    private TownStaffRepository repository;

    private TownStaffServiceImpl(){
        this.repository = TownStaffRepositoryImpl.getRepository();
    }
    public TownStaffServiceImpl getService(){
        if (service == null){
            service = new TownStaffServiceImpl();
        }
        return service;
    }




    public Set<TownStaff> getAll() {
        return this.repository.getAll();
    }


    public TownStaff create(TownStaff staff) {
        return this.repository.create(staff);
    }


    public TownStaff read(String integer) {
        return this.repository.read(integer);
    }


    public TownStaff update(TownStaff staff) {
        return this.repository.update(staff);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}

