package com.howtodoinjava.demo.service.BellvilleService.Impl;


import com.howtodoinjava.demo.domain.Bellville.ProductCakes;
import com.howtodoinjava.demo.repository.BellvilleRepo.Impl.ProductCakesRepositoryImpl;
import com.howtodoinjava.demo.repository.BellvilleRepo.ProductCakesRepository;
import com.howtodoinjava.demo.service.BellvilleService.ProductCakesService;

import java.util.Set;

public class ProductCakesServiceImpl implements ProductCakesService {
    private  ProductCakesServiceImpl service = null;
    private ProductCakesRepository repository;

    private ProductCakesServiceImpl(){
        this.repository = ProductCakesRepositoryImpl.getRepository();
    }
    public ProductCakesServiceImpl getService(){
        if (service == null){
            service = new ProductCakesServiceImpl();
        }
        return service;
    }




    public Set<ProductCakes> getAll() {
        return this.repository.getAll();
    }


    public ProductCakes create(ProductCakes cakes) {
        return this.repository.create(cakes);
    }


    public ProductCakes read(String integer) {
        return this.repository.read(integer);
    }


    public ProductCakes update(ProductCakes cakes) {
        return this.repository.update(cakes);
    }


    public void delete(String integer) {

        repository.delete(integer);
    }
}
