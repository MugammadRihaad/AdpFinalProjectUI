package com.howtodoinjava.demo.factory.Ledger;


import com.howtodoinjava.demo.domain.Ledger.Ledger;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryLedger {
    public static Ledger getLedger(){
        return new Ledger.Builder()
                    .ledgerId(IDGenerator.generateId())
                    .generalLId(IDGenerator.generateId())
                    .businessLId(IDGenerator.generateId())
                    .creditorsLId(IDGenerator.generateId())
                    .build();

    }
}
