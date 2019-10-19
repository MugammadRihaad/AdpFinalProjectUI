package com.howtodoinjava.demo.repository.TownRepo.Impl;


import com.howtodoinjava.demo.domain.Town.ProductBiscuits;
import com.howtodoinjava.demo.repository.TownRepo.ProductBiscuitsRepository;

import java.util.HashSet;
import java.util.Set;

public class ProductBiscuitsRepositoryImpl implements ProductBiscuitsRepository {
    private static ProductBiscuitsRepositoryImpl repository = null;
    private Set<ProductBiscuits> prodBiscuits;

    private ProductBiscuitsRepositoryImpl(){
        this.prodBiscuits = new HashSet<>();
    }

    public static ProductBiscuitsRepositoryImpl getRepository(){
        if (repository == null) repository = new ProductBiscuitsRepositoryImpl();
        return repository;
    }


    public ProductBiscuits create(ProductBiscuits biscuits){
        this.prodBiscuits.add(biscuits);
        return biscuits;
    }

    public ProductBiscuits read(String biscuitsId){
        return prodBiscuits.stream().filter(biscuits -> biscuits.getProductBiscuitsId().equals(biscuitsId)).findAny().orElse(null);
    }

    public void delete(String biscuitsId) {
        ProductBiscuits toDelete = read(biscuitsId);
        prodBiscuits.remove(toDelete);
    }

    public ProductBiscuits update(ProductBiscuits biscuits){
        ProductBiscuits toDelete = read(biscuits.getProductBiscuitsId());
        if(toDelete != null) {
            prodBiscuits.remove(toDelete);
            prodBiscuits.add(biscuits);
            return biscuits;
        }
        return null;
    }


    public Set<ProductBiscuits> getAll(){
        return this.prodBiscuits;
    }
}
