package com.howtodoinjava.demo.factory.MP;


import com.howtodoinjava.demo.domain.MP.MPBaker;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryMPBaker {
    public static MPBaker getMPBaker(String mpBakerName,
                                     double mpBakerSalary){
        return new MPBaker.Builder()
                .mpBakerId(IDGenerator.generateId())
                .mpBakerName(mpBakerName)
                .mpBakerSalary(mpBakerSalary)
                .build();





    }
}
