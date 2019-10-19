package com.howtodoinjava.demo.repository.MPRepo.Impl;

import com.howtodoinjava.demo.domain.MP.MPBaker;
import com.howtodoinjava.demo.factory.MP.FactoryMPBaker;
import com.howtodoinjava.demo.repository.MPRepo.MPBakerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MPBakerRepositoryImplTest {

    @Autowired
    private MPBakerRepository bakerRepository;



    @Test
    public void create() {
        MPBaker baker = FactoryMPBaker.getMPBaker("Rihaad",5000);
        bakerRepository.create(baker);

        assertNotNull(bakerRepository.getAll());
    }

    @Test
    public void read() {


        MPBaker baker = FactoryMPBaker.getMPBaker("Rihaad",5000);
        bakerRepository.create(baker);


        MPBaker bakerInSet = bakerRepository.read(baker.getMpBakerId());

        assertEquals(baker, bakerInSet);
    }

    @Test
    public void delete() {
        MPBaker baker = FactoryMPBaker.getMPBaker("Rihaad",5000);
        bakerRepository.create(baker);


        assertNotNull(bakerRepository.getAll());

        bakerRepository.delete(baker.getMpBakerId());


        MPBaker updatedVersion = bakerRepository.read(baker.getMpBakerId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        MPBaker baker = FactoryMPBaker.getMPBaker("Rihaad",5000);
        bakerRepository.create(baker);


        MPBaker bakerUpdate = FactoryMPBaker.getMPBaker("Tauriq",4000);
        bakerUpdate.setMpBakerId(baker.getMpBakerId());
        bakerRepository.update(bakerUpdate);


        MPBaker updatedVersion = bakerRepository.read(bakerUpdate.getMpBakerId());

        assertEquals(bakerUpdate, updatedVersion);
    }


}