package com.howtodoinjava.demo.repository.MPRepo.Impl;


import com.howtodoinjava.demo.domain.MP.MPAccountant;
import com.howtodoinjava.demo.factory.MP.FactoryMPAccountant;
import com.howtodoinjava.demo.repository.MPRepo.MPAccountantRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MPAccountantRepositoryImplTest {

    @Autowired
    private MPAccountantRepository accountantRepository;



    @Test
    public void create() {
        MPAccountant accountant = FactoryMPAccountant.getMPAccountant();
        accountantRepository.create(accountant);

        assertNotNull(accountantRepository.getAll());
    }

    @Test
    public void read() {
        MPAccountant accountant = FactoryMPAccountant.getMPAccountant();
        accountantRepository.create(accountant);


        MPAccountant accountantInSet = accountantRepository.read(accountant.getMpAccountId());

        assertEquals(accountant, accountantInSet);
    }

    @Test
    public void delete() {

        MPAccountant accountant = FactoryMPAccountant.getMPAccountant();
        accountantRepository.create(accountant);


        assertNotNull(accountantRepository.getAll());

        accountantRepository.delete(accountant.getMpAccountId());


        MPAccountant updatedVersion = accountantRepository.read(accountant.getMpAccountId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        MPAccountant accountant = FactoryMPAccountant.getMPAccountant();
        accountantRepository.create(accountant);


        MPAccountant accountantUpdate = FactoryMPAccountant.getMPAccountant();
        accountantUpdate.setMpAccountId(accountant.getMpAccountId());
        accountantRepository.update(accountantUpdate);


        MPAccountant updatedVersion = accountantRepository.read(accountantUpdate.getMpAccountId());

        assertEquals(accountantUpdate, updatedVersion);
    }

}