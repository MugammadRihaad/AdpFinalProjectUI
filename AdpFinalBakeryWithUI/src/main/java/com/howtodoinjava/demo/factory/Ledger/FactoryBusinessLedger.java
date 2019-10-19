package com.howtodoinjava.demo.factory.Ledger;


import com.howtodoinjava.demo.domain.Ledger.BusinessLedger;
import com.howtodoinjava.demo.util.IDGenerator;

public class FactoryBusinessLedger {
    public static BusinessLedger getBusinessLedger(String custName, double custAmountOwed){
        return new BusinessLedger.Builder()
                    .businessLId(IDGenerator.generateId())
                    .custName(custName)
                    .custAmountOwed(custAmountOwed)
                    .build();

    }
}
