package com.howtodoinjava.demo.factory.Ledger;


import com.howtodoinjava.demo.domain.Ledger.GeneralLedger;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryGeneralLedger {
    public static GeneralLedger getGeneralLedger(String date,
                                                 int totalTransaction,
                                                 double totalAmount){

        return new GeneralLedger.Builder()
                    .date(date)
                    .generalLId(IDGenerator.generateId())
                    .totalTrans(totalTransaction)
                    .totalAmount(totalAmount)
                    .build();

    }
}
