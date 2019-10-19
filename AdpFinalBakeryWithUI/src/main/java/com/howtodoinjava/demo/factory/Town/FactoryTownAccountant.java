package com.howtodoinjava.demo.factory.Town;


import com.howtodoinjava.demo.domain.Town.TownAccountant;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryTownAccountant {
    public static TownAccountant getTownAccountant(){
        return new TownAccountant.Builder()
                .tnAccountId(IDGenerator.generateId())
                .tnBusinessLId(IDGenerator.generateId())
                .tnGeneralLId(IDGenerator.generateId())
                .tnCreditorsLId(IDGenerator.generateId())
                .build();



    }
}
