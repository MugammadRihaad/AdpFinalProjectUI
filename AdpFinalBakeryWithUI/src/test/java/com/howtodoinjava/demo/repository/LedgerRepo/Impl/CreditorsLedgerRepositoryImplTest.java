package com.howtodoinjava.demo.repository.LedgerRepo.Impl;


import com.howtodoinjava.demo.domain.Ledger.CreditorsLedger;
import com.howtodoinjava.demo.factory.Ledger.FactoryCreditorsLedger;
import com.howtodoinjava.demo.repository.LedgerRepo.CreditorsLedgerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreditorsLedgerRepositoryImplTest {

    @Autowired
    private CreditorsLedgerRepository credLedgeRepository;


    @Test
    public void create() {
        CreditorsLedger creditor = FactoryCreditorsLedger.getCreditorsLedger("Makro",3000);
        credLedgeRepository.create(creditor);

        assertNotNull(credLedgeRepository.getAll());
    }

    @Test
    public void read() {
        CreditorsLedger creditor = FactoryCreditorsLedger.getCreditorsLedger("Makro",3000);
        credLedgeRepository.create(creditor);

        assertNotNull(credLedgeRepository.getAll());

        CreditorsLedger credInSet =credLedgeRepository.read(creditor.getCreditorsLId());

        assertEquals(creditor,credInSet);
    }

    @Test
    public void delete() {

        CreditorsLedger creditor = FactoryCreditorsLedger.getCreditorsLedger("Makro",3000);
        credLedgeRepository.create(creditor);


        assertNotNull(credLedgeRepository.getAll());

        credLedgeRepository.delete(creditor.getCreditorsLId());


        CreditorsLedger updatedVersion = credLedgeRepository.read(creditor.getCreditorsLId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        CreditorsLedger creditor = FactoryCreditorsLedger.getCreditorsLedger("Makro",3000);
        credLedgeRepository.create(creditor);


        CreditorsLedger credUpdate = FactoryCreditorsLedger.getCreditorsLedger("Sony",4000);
        credUpdate.setCreditorsLId(creditor.getCreditorsLId());
        credLedgeRepository.update(credUpdate);


        CreditorsLedger updatedVersion = credLedgeRepository.read(credUpdate.getCreditorsLId());

        assertEquals(credUpdate, updatedVersion);
    }


}