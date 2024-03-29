package com.howtodoinjava.demo.repository.LedgerRepo.Impl;


import com.howtodoinjava.demo.domain.Ledger.GeneralLedger;
import com.howtodoinjava.demo.factory.Ledger.FactoryGeneralLedger;
import com.howtodoinjava.demo.repository.LedgerRepo.GeneralLedgerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneralLedgerRepositoryImplTest {

    @Autowired
    private GeneralLedgerRepository generalRepository;

    @Test
    public void create() {
        GeneralLedger general = FactoryGeneralLedger.getGeneralLedger("02/09/2019",3000,23);
        generalRepository.create(general);

        assertNotNull(generalRepository.getAll());
    }

    @Test
    public void read() {

        GeneralLedger general = FactoryGeneralLedger.getGeneralLedger("02/09/2019",3000,23);
        generalRepository.create(general);

        assertNotNull(generalRepository.getAll());

        GeneralLedger generalInSet =generalRepository.read(general.getGeneralLId());

        assertEquals(general,generalInSet);
    }

    @Test
    public void delete() {

        GeneralLedger general = FactoryGeneralLedger.getGeneralLedger("02/09/2019",3000,23);
        generalRepository.create(general);


        assertNotNull(generalRepository.getAll());

        generalRepository.delete(general.getGeneralLId());


        GeneralLedger updatedVersion = generalRepository.read(general.getGeneralLId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        GeneralLedger general =FactoryGeneralLedger.getGeneralLedger("02/09/2019",3000,23);
        generalRepository.create(general);


        GeneralLedger genUpdate = FactoryGeneralLedger.getGeneralLedger("02/11/2019",2000,12);
        genUpdate.setGeneralLId(general.getGeneralLId());
        generalRepository.update(genUpdate);


        GeneralLedger updatedVersion = generalRepository.read(genUpdate.getGeneralLId());

        assertEquals(genUpdate, updatedVersion);
    }


}