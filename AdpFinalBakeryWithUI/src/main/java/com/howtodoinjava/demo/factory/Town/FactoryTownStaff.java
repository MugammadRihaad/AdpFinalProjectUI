package com.howtodoinjava.demo.factory.Town;


import com.howtodoinjava.demo.domain.Town.TownStaff;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryTownStaff {
    public static TownStaff getTownStaff(){
        return new TownStaff.Builder()
                .tnStaffId(IDGenerator.generateId())
                .tnAccountId(IDGenerator.generateId())
                .tnDelivId(IDGenerator.generateId())
                .tnBakerId(IDGenerator.generateId())
                .build();

    }
}
