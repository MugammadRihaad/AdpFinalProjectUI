package com.howtodoinjava.demo.service.BellvilleService.Impl;


import com.howtodoinjava.demo.domain.Bellville.BellvilleAccountant;
import com.howtodoinjava.demo.factory.Bellville.FactoryBellvilleAccountant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest

public class BellvilleAccountantServiceImplTest {

    @Autowired
    private BellvilleAccountantServiceImpl accountantSerivice;



    @Test
    public void create() {
        BellvilleAccountant accountant = FactoryBellvilleAccountant.getBellvilleAccountant();
        accountantSerivice.create(accountant);

        assertNotNull(accountantSerivice.getAll());
    }

    @Test
    public void read() {

        BellvilleAccountant accountant = FactoryBellvilleAccountant.getBellvilleAccountant();
        accountantSerivice.create(accountant);


        BellvilleAccountant accountantInSet = accountantSerivice.read(accountant.getBellAccountId());

        assertEquals(accountant, accountantInSet);

    }

    @Test
    public void delete() {

        BellvilleAccountant accountant = FactoryBellvilleAccountant.getBellvilleAccountant();
        accountantSerivice.create(accountant);


        assertNotNull(accountantSerivice.getAll());

        accountantSerivice.delete(accountant.getBellAccountId());


        BellvilleAccountant updatedVersion = accountantSerivice.read(accountant.getBellAccountId());

        assertNull(updatedVersion);

    }

    @Test
    public void update() {

        BellvilleAccountant accountant = FactoryBellvilleAccountant.getBellvilleAccountant();
        accountantSerivice.create(accountant);


        BellvilleAccountant accountantUpdate = FactoryBellvilleAccountant.getBellvilleAccountant();
        accountantUpdate.setBellAccountID(accountant.getBellAccountId());
        accountantSerivice.update(accountantUpdate);


        BellvilleAccountant updatedVersion = accountantSerivice.read(accountantUpdate.getBellAccountId());

        assertEquals(accountantUpdate, updatedVersion);

    }
}