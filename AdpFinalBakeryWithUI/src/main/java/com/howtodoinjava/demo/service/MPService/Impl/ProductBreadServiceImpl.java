package com.howtodoinjava.demo.service.MPService.Impl;


import com.howtodoinjava.demo.domain.MP.ProductBread;
import com.howtodoinjava.demo.repository.MPRepo.Impl.ProductBreadRepositoryImpl;
import com.howtodoinjava.demo.repository.MPRepo.ProductBreadRepository;
import com.howtodoinjava.demo.service.MPService.ProductBreadService;

import java.util.Set;

public class ProductBreadServiceImpl implements ProductBreadService {
    private  ProductBreadServiceImpl service = null;
    private ProductBreadRepository repository;

    private ProductBreadServiceImpl(){
        this.repository = ProductBreadRepositoryImpl.getRepository();
    }
    public ProductBreadServiceImpl getService(){
        if (service == null){
            service = new ProductBreadServiceImpl();
        }
        return service;
    }




    public Set<ProductBread> getAll() {
        return this.repository.getAll();
    }


    public ProductBread create(ProductBread bread) {
        return this.repository.create(bread);
    }


    public ProductBread read(String integer) {
        return this.repository.read(integer);
    }


    public ProductBread update(ProductBread bread) {
        return this.repository.update(bread);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
