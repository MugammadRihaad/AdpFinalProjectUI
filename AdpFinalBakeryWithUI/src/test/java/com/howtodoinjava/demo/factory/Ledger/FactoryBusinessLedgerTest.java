package com.howtodoinjava.demo.factory.Ledger;


import com.howtodoinjava.demo.domain.Ledger.BusinessLedger;
import org.junit.Assert;
import org.junit.Test;

public class FactoryBusinessLedgerTest {

    @Test
    public void getBusinessLedger() {

        String custName="StarBucks";
        double custAmountOwed=3000.00;

        BusinessLedger bl=FactoryBusinessLedger.getBusinessLedger(custName,custAmountOwed);

        Assert.assertNotNull(bl);
    }
}