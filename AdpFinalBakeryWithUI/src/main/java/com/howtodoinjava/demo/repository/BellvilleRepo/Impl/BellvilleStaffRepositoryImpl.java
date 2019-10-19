package com.howtodoinjava.demo.repository.BellvilleRepo.Impl;


import com.howtodoinjava.demo.domain.Bellville.BellvilleStaff;
import com.howtodoinjava.demo.repository.BellvilleRepo.BellvilleStaffRepository;

import java.util.HashSet;
import java.util.Set;

public class BellvilleStaffRepositoryImpl implements BellvilleStaffRepository {
    private static BellvilleStaffRepositoryImpl repository = null;
    private Set<BellvilleStaff> bellStaff;

    private BellvilleStaffRepositoryImpl(){
        this.bellStaff = new HashSet<>();
    }

    public static BellvilleStaffRepositoryImpl getRepository(){
        if (repository == null) repository = new BellvilleStaffRepositoryImpl();
        return repository;
    }


    public BellvilleStaff create(BellvilleStaff staff){
        this.bellStaff.add(staff);
        return staff;
    }

    public BellvilleStaff read(String staffId){
        return bellStaff.stream().filter(staff -> staff.getBellStaffId().equals(staffId)).findAny().orElse(null);
    }

    public void delete(String staffId) {
        BellvilleStaff inDelete=read(staffId);
        bellStaff.remove(inDelete);
    }

    public BellvilleStaff update(BellvilleStaff staff){
        BellvilleStaff inDelete = read(staff.getBellStaffId());

        if(inDelete != null){
            bellStaff.remove(inDelete);
            bellStaff.add(staff);
            return staff;
        }

        return null;
    }


    public Set<BellvilleStaff> getAll(){
        return this.bellStaff;
    }
}
