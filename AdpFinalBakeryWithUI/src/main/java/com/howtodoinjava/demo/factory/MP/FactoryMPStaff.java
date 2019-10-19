package com.howtodoinjava.demo.factory.MP;


import com.howtodoinjava.demo.domain.MP.MPStaff;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryMPStaff {
    public static MPStaff getMPStaff( ){
        return new MPStaff.Builder()
                .mpStaffId(IDGenerator.generateId())
                .mpAccountId(IDGenerator.generateId())
                .mpDelivId(IDGenerator.generateId())
                .mpBakerId(IDGenerator.generateId())
                .build();

    }
}
