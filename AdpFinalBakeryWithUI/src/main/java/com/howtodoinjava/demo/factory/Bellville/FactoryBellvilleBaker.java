package com.howtodoinjava.demo.factory.Bellville;


import com.howtodoinjava.demo.domain.Bellville.bellvilleBaker;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryBellvilleBaker {
    public static bellvilleBaker getBellvilleBaker(String bellBakerName,
                                                   double bellBakerSalary){
        return new bellvilleBaker.Builder()
                .bellBakerId(IDGenerator.generateId())
                .bellBakerName(bellBakerName)
                .bellBakerSalary(bellBakerSalary)
                .build();





    }
}
