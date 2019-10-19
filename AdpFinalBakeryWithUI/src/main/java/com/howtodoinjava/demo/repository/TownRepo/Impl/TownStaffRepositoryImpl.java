package com.howtodoinjava.demo.repository.TownRepo.Impl;


import com.howtodoinjava.demo.domain.Town.TownStaff;
import com.howtodoinjava.demo.repository.TownRepo.TownStaffRepository;

import java.util.HashSet;
import java.util.Set;

public class TownStaffRepositoryImpl implements TownStaffRepository {
    private static TownStaffRepositoryImpl repository = null;
    private Set<TownStaff> tnStaff;

    private TownStaffRepositoryImpl(){
        this.tnStaff = new HashSet<>();
    }

    public static TownStaffRepositoryImpl getRepository(){
        if (repository == null) repository = new TownStaffRepositoryImpl();
        return repository;
    }


    public TownStaff create(TownStaff staff){
        this.tnStaff.add(staff);
        return staff;
    }

    public TownStaff read(String staffId){
        return tnStaff.stream().filter(staff -> staff.getTnStaffId().equals(staffId)).findAny().orElse(null);
    }

    public void delete(String staffId) {
        TownStaff toDelete = read(staffId);
        tnStaff.remove(toDelete);
    }

    public TownStaff update(TownStaff staff){
        TownStaff toDelete = read(staff.getTnStaffId());
        if(toDelete != null) {
            tnStaff.remove(toDelete);
            tnStaff.add(staff);
            return staff;
        }
        return null;
    }


    public Set<TownStaff> getAll(){
        return this.tnStaff;
    }
}
