package com.howtodoinjava.demo.service.TownService.Impl;

import com.howtodoinjava.demo.domain.Town.TownAccountant;
import com.howtodoinjava.demo.factory.Town.FactoryTownAccountant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TownAccountantServiceImplTest {


    @Autowired
    private TownAccountantServiceImpl accountantService;


    @Test
    public void create() {
        TownAccountant accountant = FactoryTownAccountant.getTownAccountant();
        accountantService.create(accountant);

        assertNotNull(accountantService.getAll());
    }

    @Test
    public void read() {
        TownAccountant accountant = FactoryTownAccountant.getTownAccountant();
        accountantService.create(accountant);


        TownAccountant accountantInSet = accountantService.read(accountant.getTnAccountId());

        assertEquals(accountant, accountantInSet);
    }

    @Test
    public void delete() {

        TownAccountant accountant = FactoryTownAccountant.getTownAccountant();
        accountantService.create(accountant);


        assertNotNull(accountantService.getAll());

        accountantService.delete(accountant.getTnAccountId());


        TownAccountant updatedVersion = accountantService.read(accountant.getTnAccountId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {
        TownAccountant accountant = FactoryTownAccountant.getTownAccountant();
        accountantService.create(accountant);


        TownAccountant accountantUpdate = FactoryTownAccountant.getTownAccountant();
        accountantUpdate.setTnAccountId(accountant.getTnAccountId());
        accountantService.update(accountantUpdate);


        TownAccountant updatedVersion = accountantService.read(accountantUpdate.getTnAccountId());

        assertEquals(accountantUpdate, updatedVersion);
    }
}