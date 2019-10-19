package com.howtodoinjava.demo.repository.BellvilleRepo.Impl;


import com.howtodoinjava.demo.domain.Bellville.bellvilleBaker;
import com.howtodoinjava.demo.factory.Bellville.FactoryBellvilleBaker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BellvilleBakerRepositoryImplTest {
    @Autowired
    private BellvilleBakerRepositoryImpl bakerRepository;


    @Test
    public void create() {
        bellvilleBaker baker = FactoryBellvilleBaker.getBellvilleBaker("Rihaad",5000);
        bakerRepository.create(baker);

        assertNotNull(bakerRepository.getAll());
    }

    @Test
    public void read() {


        bellvilleBaker baker = FactoryBellvilleBaker.getBellvilleBaker("Rihaad",5000);
        bakerRepository.create(baker);


        bellvilleBaker bakerInSet = bakerRepository.read(baker.getBellBakerId());

        assertEquals(baker, bakerInSet);
    }

    @Test
    public void delete() {


        bellvilleBaker baker = FactoryBellvilleBaker.getBellvilleBaker("Rihaad",5000);
        bakerRepository.create(baker);


        assertNotNull(bakerRepository.getAll());

        bakerRepository.delete(baker.getBellBakerId());


        bellvilleBaker updatedVersion = bakerRepository.read(baker.getBellBakerId());

        assertNull(updatedVersion);
    }

    private void assertNull(bellvilleBaker updatedVersion) {
    }

    @Test
    public void update() {

        bellvilleBaker baker = FactoryBellvilleBaker.getBellvilleBaker("Rihaad",5000);
        bakerRepository.create(baker);


        bellvilleBaker bakerUpdate = FactoryBellvilleBaker.getBellvilleBaker("Tauriq",6000);
        bakerUpdate.setBellBakerID(baker.getBellBakerId());
        bakerRepository.update(bakerUpdate);


        bellvilleBaker updatedVersion = bakerRepository.read(bakerUpdate.getBellBakerId());

        assertEquals(bakerUpdate, updatedVersion);

    }


}