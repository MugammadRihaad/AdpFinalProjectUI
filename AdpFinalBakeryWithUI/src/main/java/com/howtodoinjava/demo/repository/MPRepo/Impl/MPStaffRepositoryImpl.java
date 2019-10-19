package com.howtodoinjava.demo.repository.MPRepo.Impl;


import com.howtodoinjava.demo.domain.MP.MPStaff;
import com.howtodoinjava.demo.repository.MPRepo.MPStaffRepository;

import java.util.HashSet;
import java.util.Set;

public class MPStaffRepositoryImpl implements MPStaffRepository {
    private static MPStaffRepositoryImpl repository = null;
    private Set<MPStaff> mpStaff;

    private MPStaffRepositoryImpl(){
        this.mpStaff = new HashSet<>();
    }

    public static MPStaffRepositoryImpl getRepository(){
        if (repository == null) repository = new MPStaffRepositoryImpl();
        return repository;
    }


    public MPStaff create(MPStaff staff){
        this.mpStaff.add(staff);
        return staff;
    }

    public MPStaff read(String staffId){
        return mpStaff.stream().filter(staff -> staff.getMpStaffId().equals(staffId)).findAny().orElse(null);
    }

    public void delete(String staffId) {
        MPStaff toDelete = read(staffId);
        mpStaff.remove(toDelete);
    }

    public MPStaff update(MPStaff staff){
        MPStaff toDelete = read(staff.getMpStaffId());
        if(toDelete != null) {
            mpStaff.remove(toDelete);
            mpStaff.add(staff);
            return staff;
        }
        return null;
    }


    public Set<MPStaff> getAll(){
        return this.mpStaff;
    }
}
