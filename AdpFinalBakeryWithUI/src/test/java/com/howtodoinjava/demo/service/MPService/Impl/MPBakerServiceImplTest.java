package com.howtodoinjava.demo.service.MPService.Impl;

import com.howtodoinjava.demo.domain.MP.MPBaker;
import com.howtodoinjava.demo.factory.MP.FactoryMPBaker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MPBakerServiceImplTest {


    @Autowired
    private MPBakerServiceImpl bakerService;



    @Test
    public void create() {
        MPBaker baker = FactoryMPBaker.getMPBaker("Rihaad",5000);
        bakerService.create(baker);

        assertNotNull(bakerService.getAll());
    }

    @Test
    public void read() {


        MPBaker baker = FactoryMPBaker.getMPBaker("Rihaad",5000);
        bakerService.create(baker);


        MPBaker bakerInSet = bakerService.read(baker.getMpBakerId());

        assertEquals(baker, bakerInSet);
    }

    @Test
    public void delete() {
        MPBaker baker = FactoryMPBaker.getMPBaker("Rihaad",5000);
        bakerService.create(baker);


        assertNotNull(bakerService.getAll());

        bakerService.delete(baker.getMpBakerId());


        MPBaker updatedVersion = bakerService.read(baker.getMpBakerId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        MPBaker baker = FactoryMPBaker.getMPBaker("Rihaad",5000);
        bakerService.create(baker);


        MPBaker bakerUpdate = FactoryMPBaker.getMPBaker("Tauriq",4000);
        bakerUpdate.setMpBakerId(baker.getMpBakerId());
        bakerService.update(bakerUpdate);


        MPBaker updatedVersion = bakerService.read(bakerUpdate.getMpBakerId());

        assertEquals(bakerUpdate, updatedVersion);
    }

}