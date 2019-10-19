package com.howtodoinjava.demo.service.TownService.Impl;


import com.howtodoinjava.demo.domain.Town.ProductBiscuits;
import com.howtodoinjava.demo.repository.TownRepo.Impl.ProductBiscuitsRepositoryImpl;
import com.howtodoinjava.demo.repository.TownRepo.ProductBiscuitsRepository;
import com.howtodoinjava.demo.service.TownService.ProductBiscuitsService;

import java.util.Set;

public class ProductBiscuitsServiceImpl implements ProductBiscuitsService {
    private  ProductBiscuitsServiceImpl service = null;
    private ProductBiscuitsRepository repository;

    private ProductBiscuitsServiceImpl(){
        this.repository = ProductBiscuitsRepositoryImpl.getRepository();
    }
    public ProductBiscuitsServiceImpl getService(){
        if (service == null){
            service = new ProductBiscuitsServiceImpl();
        }
        return service;
    }




    public Set<ProductBiscuits> getAll() {
        return this.repository.getAll();
    }


    public ProductBiscuits create(ProductBiscuits biscuits) {
        return this.repository.create(biscuits);
    }


    public ProductBiscuits read(String integer) {
        return this.repository.read(integer);
    }


    public ProductBiscuits update(ProductBiscuits biscuits) {
        return this.repository.update(biscuits);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
