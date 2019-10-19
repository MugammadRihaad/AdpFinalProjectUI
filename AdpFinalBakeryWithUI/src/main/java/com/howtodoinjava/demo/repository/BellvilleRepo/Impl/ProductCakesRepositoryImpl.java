package com.howtodoinjava.demo.repository.BellvilleRepo.Impl;


import com.howtodoinjava.demo.domain.Bellville.ProductCakes;
import com.howtodoinjava.demo.repository.BellvilleRepo.ProductCakesRepository;

import java.util.HashSet;
import java.util.Set;

public class ProductCakesRepositoryImpl implements ProductCakesRepository {
    private static ProductCakesRepositoryImpl repository = null;
    private Set<ProductCakes> prodCakes;

    private ProductCakesRepositoryImpl(){
        this.prodCakes = new HashSet<>();
    }

    public static ProductCakesRepositoryImpl getRepository(){
        if (repository == null) repository = new ProductCakesRepositoryImpl();
        return repository;
    }


    public ProductCakes create(ProductCakes cakes){
        this.prodCakes.add(cakes);
        return cakes;
    }

    public ProductCakes read(String cakesId){
        return prodCakes.stream().filter(cakes -> cakes.getProductCakeId().equals(cakesId)).findAny().orElse(null);
    }

    public void delete(String cakesId) {
        ProductCakes inDelete=read(cakesId);
        prodCakes.remove(inDelete);
    }

    public ProductCakes update(ProductCakes cakes){
        ProductCakes inDelete = read(cakes.getProductCakeId());

        if(inDelete != null){
            prodCakes.remove(inDelete);
            prodCakes.add(cakes);
            return cakes;
        }

        return null;
    }


    public Set<ProductCakes> getAll(){
        return this.prodCakes;
    }
}
