package com.howtodoinjava.demo.factory.Ledger;


import com.howtodoinjava.demo.domain.Ledger.CreditorsLedger;
import org.junit.Assert;
import org.junit.Test;

public class FactoryCreditorsLedgerTest {

    @Test
    public void getCreditorsLedger() {

        String supplierName="Joko";
        double suppAmountOwed=4000;

        CreditorsLedger cl=FactoryCreditorsLedger.getCreditorsLedger(supplierName,suppAmountOwed);

        Assert.assertNotNull(cl);

    }
}