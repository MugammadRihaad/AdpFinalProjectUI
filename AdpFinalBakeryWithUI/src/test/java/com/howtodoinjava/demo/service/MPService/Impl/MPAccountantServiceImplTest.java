package com.howtodoinjava.demo.service.MPService.Impl;

import com.howtodoinjava.demo.domain.MP.MPAccountant;
import com.howtodoinjava.demo.factory.MP.FactoryMPAccountant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MPAccountantServiceImplTest {


    @Autowired
    private MPAccountantServiceImpl accountantService;



    @Test
    public void create() {
        MPAccountant accountant = FactoryMPAccountant.getMPAccountant();
        accountantService.create(accountant);

        assertNotNull(accountantService.getAll());
    }

    @Test
    public void read() {
        MPAccountant accountant = FactoryMPAccountant.getMPAccountant();
        accountantService.create(accountant);


        MPAccountant accountantInSet = accountantService.read(accountant.getMpAccountId());

        assertEquals(accountant, accountantInSet);
    }

    @Test
    public void delete() {

        MPAccountant accountant = FactoryMPAccountant.getMPAccountant();
        accountantService.create(accountant);


        assertNotNull(accountantService.getAll());

        accountantService.delete(accountant.getMpAccountId());


        MPAccountant updatedVersion = accountantService.read(accountant.getMpAccountId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        MPAccountant accountant = FactoryMPAccountant.getMPAccountant();
        accountantService.create(accountant);


        MPAccountant accountantUpdate = FactoryMPAccountant.getMPAccountant();
        accountantUpdate.setMpAccountId(accountant.getMpAccountId());
        accountantService.update(accountantUpdate);


        MPAccountant updatedVersion = accountantService.read(accountantUpdate.getMpAccountId());

        assertEquals(accountantUpdate, updatedVersion);
    }

}