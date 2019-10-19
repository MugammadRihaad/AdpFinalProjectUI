package com.howtodoinjava.demo.factory.Town;


import com.howtodoinjava.demo.domain.Town.TownBranch;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryTownBranch {
    public static TownBranch getTownBranch(){
        return new TownBranch.Builder()
                .tnBrId(IDGenerator.generateId())
                .tnStaffId(IDGenerator.generateId())
                .build();

    }
}
