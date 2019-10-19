package com.howtodoinjava.demo.factory.Bellville;


import com.howtodoinjava.demo.domain.Bellville.BellvilleBranch;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryBellvilleBranch {
    public static BellvilleBranch getBellvillBranch(){
       return new BellvilleBranch.Builder()
                 .bellBrId(IDGenerator.generateId())
                 .bellStaffId(IDGenerator.generateId())
                  .build();

    }
}
