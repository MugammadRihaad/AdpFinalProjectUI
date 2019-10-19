package com.howtodoinjava.demo.repository.TownRepo.Impl;
import com.howtodoinjava.demo.domain.Town.TownAccountant;
import com.howtodoinjava.demo.factory.Town.FactoryTownAccountant;
import com.howtodoinjava.demo.repository.TownRepo.TownAccountantRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TownAccountantRepositoryImplTest {

    @Autowired
    private TownAccountantRepository accountantRepository;


    @Test
    public void create() {
        TownAccountant accountant = FactoryTownAccountant.getTownAccountant();
        accountantRepository.create(accountant);

        assertNotNull(accountantRepository.getAll());
    }

    @Test
    public void read() {
        TownAccountant accountant = FactoryTownAccountant.getTownAccountant();
        accountantRepository.create(accountant);


        TownAccountant accountantInSet = accountantRepository.read(accountant.getTnAccountId());

        assertEquals(accountant, accountantInSet);
    }

    @Test
    public void delete() {

        TownAccountant accountant = FactoryTownAccountant.getTownAccountant();
        accountantRepository.create(accountant);


        assertNotNull(accountantRepository.getAll());

        accountantRepository.delete(accountant.getTnAccountId());


        TownAccountant updatedVersion = accountantRepository.read(accountant.getTnAccountId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {
        TownAccountant accountant = FactoryTownAccountant.getTownAccountant();
        accountantRepository.create(accountant);


        TownAccountant accountantUpdate = FactoryTownAccountant.getTownAccountant();
        accountantUpdate.setTnAccountId(accountant.getTnAccountId());
        accountantRepository.update(accountantUpdate);


        TownAccountant updatedVersion = accountantRepository.read(accountantUpdate.getTnAccountId());

        assertEquals(accountantUpdate, updatedVersion);
    }


}