package com.howtodoinjava.demo.repository.LedgerRepo.Impl;


import com.howtodoinjava.demo.domain.Ledger.Ledger;
import com.howtodoinjava.demo.factory.Ledger.FactoryLedger;
import com.howtodoinjava.demo.repository.LedgerRepo.LedgerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LedgerRepositoryImplTest {

    @Autowired
    private LedgerRepository ledgerRepository;


    @Test
    public void create() {
        Ledger ledger = FactoryLedger.getLedger();
        ledgerRepository.create(ledger);

        assertNotNull(ledgerRepository.getAll());
    }

    @Test
    public void read() {

        Ledger ledger = FactoryLedger.getLedger();
        ledgerRepository.create(ledger);

        assertNotNull(ledgerRepository.getAll());

        Ledger ledgerInSet =ledgerRepository.read(ledger.getLedgerId());

        assertEquals(ledger,ledgerInSet);
    }

    @Test
    public void delete() {

        Ledger ledger = FactoryLedger.getLedger();
        ledgerRepository.create(ledger);


        assertNotNull(ledgerRepository.getAll());

        ledgerRepository.delete(ledger.getLedgerId());


        Ledger updatedVersion = ledgerRepository.read(ledger.getLedgerId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        Ledger ledger =FactoryLedger.getLedger();
        ledgerRepository.create(ledger);


        Ledger ledgerUpdate = FactoryLedger.getLedger();
        ledgerUpdate.setGeneralLId(ledger.getLedgerId());
        ledgerRepository.update(ledgerUpdate);


        Ledger updatedVersion = ledgerRepository.read(ledgerUpdate.getGeneralLId());


    }


}