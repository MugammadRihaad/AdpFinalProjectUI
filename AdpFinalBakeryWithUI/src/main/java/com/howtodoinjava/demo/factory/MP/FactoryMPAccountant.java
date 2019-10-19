package com.howtodoinjava.demo.factory.MP;


import com.howtodoinjava.demo.domain.MP.MPAccountant;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryMPAccountant {
    public static MPAccountant getMPAccountant(){
        return new MPAccountant.Builder()
                .mpAccountId(IDGenerator.generateId())
                .mpBusinessLId(IDGenerator.generateId())
                .mpGeneralLId(IDGenerator.generateId())
                .mpCreditorsLId(IDGenerator.generateId())
                .build();



    }
}
