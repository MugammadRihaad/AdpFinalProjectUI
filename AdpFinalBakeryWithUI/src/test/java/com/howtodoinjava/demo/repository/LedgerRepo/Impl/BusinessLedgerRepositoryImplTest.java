package com.howtodoinjava.demo.repository.LedgerRepo.Impl;


import com.howtodoinjava.demo.domain.Ledger.BusinessLedger;
import com.howtodoinjava.demo.factory.Ledger.FactoryBusinessLedger;
import com.howtodoinjava.demo.repository.LedgerRepo.BusinessLedgerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessLedgerRepositoryImplTest {

    @Autowired
    private BusinessLedgerRepository ledgerRepository;


    @Test
    public void create() {
        BusinessLedger ledger = FactoryBusinessLedger.getBusinessLedger("Makro",3000);
        ledgerRepository.create(ledger);

        assertNotNull(ledgerRepository.getAll());
    }

    @Test
    public void read() {
        BusinessLedger ledger = FactoryBusinessLedger.getBusinessLedger("Makro",3000);
        ledgerRepository.create(ledger);

        assertNotNull(ledgerRepository.getAll());

        BusinessLedger officeInSet =ledgerRepository.read(ledger.getBusniessLId());

        assertEquals(ledger,officeInSet);
    }

    @Test
    public void delete() {

        BusinessLedger ledger = FactoryBusinessLedger.getBusinessLedger("Makro",3000);
        ledgerRepository.create(ledger);


        assertNotNull(ledgerRepository.getAll());

        ledgerRepository.delete(ledger.getBusniessLId());


        BusinessLedger updatedVersion = ledgerRepository.read(ledger.getBusniessLId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        BusinessLedger ledger = FactoryBusinessLedger.getBusinessLedger("Makro",3000);
        ledgerRepository.create(ledger);


        BusinessLedger ledgerUpdate = FactoryBusinessLedger.getBusinessLedger("Sony",4000);
        ledgerUpdate.setBusinessLId(ledger.getBusniessLId());
        ledgerRepository.update(ledgerUpdate);


        BusinessLedger updatedVersion = ledgerRepository.read(ledgerUpdate.getBusniessLId());

        assertEquals(ledgerUpdate, updatedVersion);
    }


}