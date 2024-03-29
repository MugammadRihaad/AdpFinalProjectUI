package com.howtodoinjava.demo.repository.HeadOffice.Impl;


import com.howtodoinjava.demo.domain.HeadOffice;
import com.howtodoinjava.demo.repository.HeadOffice.HeadOfficeRepository;

import java.util.HashSet;
import java.util.Set;

public class HeadOfficeRepositoryImpl implements HeadOfficeRepository {
    private static HeadOfficeRepositoryImpl repository = null;
    private Set<HeadOffice> offices;

    private HeadOfficeRepositoryImpl(){
        this.offices = new HashSet<>();
    }

    public static HeadOfficeRepositoryImpl getRepository(){
        if (repository == null) repository = new HeadOfficeRepositoryImpl();
        return repository;
    }


    public HeadOffice create(HeadOffice office){
        this.offices.add(office);
        return office;
    }

    public HeadOffice read(String officeId){
        return offices.stream().filter(office -> office.getOfficeId().equals(officeId)).findAny().orElse(null);
    }

    public void delete(String officeId) {
        HeadOffice toDelete = read(officeId);
        offices.remove(toDelete);
    }

    public HeadOffice update(HeadOffice office){
        HeadOffice inDelete = read(office.getOfficeId());

        if(inDelete != null){
            offices.remove(inDelete);
            offices.add(office);
            return office;
        }

        return null;
    }


    public Set<HeadOffice> getAll(){
        return this.offices;
    }
}
