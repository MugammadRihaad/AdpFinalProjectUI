package com.howtodoinjava.demo.service.LedgerService.Impl;

import com.howtodoinjava.demo.domain.Ledger.GeneralLedger;
import com.howtodoinjava.demo.factory.Ledger.FactoryGeneralLedger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneralLedgerServiceImplTest {

    @Autowired
    private GeneralLedgerServiceImpl generalService;

    @Test
    public void create() {
        GeneralLedger general = FactoryGeneralLedger.getGeneralLedger("02/09/2019",3000,23);
        generalService.create(general);

        assertNotNull(generalService.getAll());
    }

    @Test
    public void read() {

        GeneralLedger general = FactoryGeneralLedger.getGeneralLedger("02/09/2019",3000,23);
        generalService.create(general);

        assertNotNull(generalService.getAll());

        GeneralLedger generalInSet =generalService.read(general.getGeneralLId());

        assertEquals(general,generalInSet);
    }

    @Test
    public void delete() {

        GeneralLedger general = FactoryGeneralLedger.getGeneralLedger("02/09/2019",3000,23);
        generalService.create(general);


        assertNotNull(generalService.getAll());

        generalService.delete(general.getGeneralLId());


        GeneralLedger updatedVersion = generalService.read(general.getGeneralLId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        GeneralLedger general =FactoryGeneralLedger.getGeneralLedger("02/09/2019",3000,23);
        generalService.create(general);


        GeneralLedger genUpdate = FactoryGeneralLedger.getGeneralLedger("02/11/2019",2000,12);
        genUpdate.setGeneralLId(general.getGeneralLId());
        generalService.update(genUpdate);


        GeneralLedger updatedVersion = generalService.read(genUpdate.getGeneralLId());

        assertEquals(genUpdate, updatedVersion);
    }

}