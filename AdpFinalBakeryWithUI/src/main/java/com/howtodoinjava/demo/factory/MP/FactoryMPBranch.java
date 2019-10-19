package com.howtodoinjava.demo.factory.MP;


import com.howtodoinjava.demo.domain.MP.MPBranch;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryMPBranch {
    public static MPBranch getMPBranch(){
        return new MPBranch.Builder()
        .mpBrId(IDGenerator.generateId())
        .mpStaffId(IDGenerator.generateId())
        .build();

        }
        }
