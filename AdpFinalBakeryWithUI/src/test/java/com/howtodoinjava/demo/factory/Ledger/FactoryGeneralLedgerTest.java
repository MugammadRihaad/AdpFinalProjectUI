package com.howtodoinjava.demo.factory.Ledger;


import com.howtodoinjava.demo.domain.Ledger.GeneralLedger;
import org.junit.Assert;
import org.junit.Test;

public class FactoryGeneralLedgerTest {

    @Test
    public void getGeneralLedger() {
        String date= "03/11/2016";

        int totalTransaction=6;
        double totalAmount=20000;

        GeneralLedger gl=FactoryGeneralLedger.getGeneralLedger(date,totalTransaction,totalAmount);

        Assert.assertNotNull(gl);
    }
}