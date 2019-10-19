package com.howtodoinjava.demo.factory.Ledger;


import com.howtodoinjava.demo.domain.Ledger.Ledger;
import org.junit.Assert;
import org.junit.Test;

public class FactoryLedgerTest {

    @Test
    public void getLedger() {


        Ledger l=FactoryLedger.getLedger();

        Assert.assertNotNull(l);
    }
}