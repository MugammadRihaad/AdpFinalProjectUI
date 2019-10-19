package com.howtodoinjava.demo.repository.MPRepo.Impl;


import com.howtodoinjava.demo.domain.MP.ProductBread;
import com.howtodoinjava.demo.repository.MPRepo.ProductBreadRepository;

import java.util.HashSet;
import java.util.Set;

public class ProductBreadRepositoryImpl implements ProductBreadRepository {
    private static ProductBreadRepositoryImpl repository = null;
    private Set<ProductBread> prodBread;

    private ProductBreadRepositoryImpl(){
        this.prodBread = new HashSet<>();
    }

    public static ProductBreadRepositoryImpl getRepository(){
        if (repository == null) repository = new ProductBreadRepositoryImpl();
        return repository;
    }


    public ProductBread create(ProductBread bread){
        this.prodBread.add(bread);
        return bread;
    }

    public ProductBread read(String breadId){
        return prodBread.stream().filter(bread -> bread.getProductBreadId().equals(breadId)).findAny().orElse(null);
    }

    public void delete(String breadId) {
        ProductBread toDelete = read(breadId);
        prodBread.remove(toDelete);
    }

    public ProductBread update(ProductBread bread){
        ProductBread toDelete = read(bread.getProductBreadId());
        if(toDelete != null) {
            prodBread.remove(toDelete);
            prodBread.add(bread);
            return bread;
        }
        return null;
    }


    public Set<ProductBread> getAll(){
        return this.prodBread;
    }
}
