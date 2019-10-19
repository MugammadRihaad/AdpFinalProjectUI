package com.howtodoinjava.demo.factory.Ledger;


import com.howtodoinjava.demo.domain.Ledger.CreditorsLedger;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryCreditorsLedger {
    public static CreditorsLedger getCreditorsLedger(
            String supplierName, double suppAmountOwed){
        return new CreditorsLedger.Builder()
                    .creditorsLId(IDGenerator.generateId())
                    .supplierName(supplierName)
                    .suppAmountOwed(suppAmountOwed)
                    .build();

    }

}
