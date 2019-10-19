package com.howtodoinjava.demo.factory.HeadOffice;


import com.howtodoinjava.demo.domain.HeadOffice;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryHeadOffice {

    public static HeadOffice getHeadOffice(){
        return new HeadOffice.Builder()
                    .officeId(IDGenerator.generateId())
                    .bellvilleBrId(IDGenerator.generateId())
                    .townBrId(IDGenerator.generateId())
                    .mpBrId(IDGenerator.generateId())
                    .build();

    }
}
