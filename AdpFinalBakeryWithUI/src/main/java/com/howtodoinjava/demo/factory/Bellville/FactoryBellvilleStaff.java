package com.howtodoinjava.demo.factory.Bellville;


import com.howtodoinjava.demo.domain.Bellville.BellvilleStaff;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryBellvilleStaff {
    public static BellvilleStaff getBellvilleStaff(){
        return new BellvilleStaff.Builder()
                    .bellStaffId(IDGenerator.generateId())
                    .bellAccountId(IDGenerator.generateId())
                    .bellDelivId(IDGenerator.generateId())
                    .bellBakerId(IDGenerator.generateId())
                    .build();

    }
}
