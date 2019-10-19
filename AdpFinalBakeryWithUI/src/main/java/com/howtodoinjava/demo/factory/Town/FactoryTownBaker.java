package com.howtodoinjava.demo.factory.Town;


import com.howtodoinjava.demo.domain.Town.TownBaker;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryTownBaker {
    public static TownBaker getTownBaker(String tnBakerName,
                                         double tnBakerSalary){
        return new TownBaker.Builder()
                .tnBakerId(IDGenerator.generateId())
                .tnBakerName(tnBakerName)
                .tnBakerSalary(tnBakerSalary)
                .build();





    }
}
