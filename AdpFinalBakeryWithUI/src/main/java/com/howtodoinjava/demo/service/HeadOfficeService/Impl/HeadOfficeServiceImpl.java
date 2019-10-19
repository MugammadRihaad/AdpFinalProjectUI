package com.howtodoinjava.demo.service.HeadOfficeService.Impl;


import com.howtodoinjava.demo.domain.HeadOffice;
import com.howtodoinjava.demo.repository.HeadOffice.HeadOfficeRepository;
import com.howtodoinjava.demo.repository.HeadOffice.Impl.HeadOfficeRepositoryImpl;
import com.howtodoinjava.demo.service.HeadOfficeService.HeadOfficeService;

import java.util.Set;

public class HeadOfficeServiceImpl implements HeadOfficeService {
    private  HeadOfficeServiceImpl service = null;
    private HeadOfficeRepository repository;

    private HeadOfficeServiceImpl(){
        this.repository = HeadOfficeRepositoryImpl.getRepository();
    }
    public HeadOfficeServiceImpl getService(){
        if (service == null){
            service = new HeadOfficeServiceImpl();
        }
        return service;
    }




    public Set<HeadOffice> getAll() {
        return this.repository.getAll();
    }


    public HeadOffice create(HeadOffice office) {
        return this.repository.create(office);
    }


    public HeadOffice read(String integer) {
        return this.repository.read(integer);
    }


    public HeadOffice update(HeadOffice office) {
        return this.repository.update(office);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
