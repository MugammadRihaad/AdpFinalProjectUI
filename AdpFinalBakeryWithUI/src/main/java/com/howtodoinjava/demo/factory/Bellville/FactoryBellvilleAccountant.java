package com.howtodoinjava.demo.factory.Bellville;


import com.howtodoinjava.demo.domain.Bellville.BellvilleAccountant;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryBellvilleAccountant {
    public static BellvilleAccountant getBellvilleAccountant(){
        return new BellvilleAccountant.Builder()
                .bellAccountId(IDGenerator.generateId())
                .bellLedgerId(IDGenerator.generateId())
                .bellBusinessLId(IDGenerator.generateId())
                .bellGeneralLId(IDGenerator.generateId())
                .bellCreditorsLId(IDGenerator.generateId())
                .build();



    }
}
