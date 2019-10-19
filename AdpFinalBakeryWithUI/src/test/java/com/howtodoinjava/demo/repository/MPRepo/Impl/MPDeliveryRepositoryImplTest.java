package com.howtodoinjava.demo.repository.MPRepo.Impl;

import com.howtodoinjava.demo.domain.MP.MPDelivery;
import com.howtodoinjava.demo.factory.MP.FactoryMPDelivery;
import com.howtodoinjava.demo.repository.MPRepo.MPDeliveryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MPDeliveryRepositoryImplTest {
    @Autowired
    private MPDeliveryRepository deliveryRepository;


    @Test
    public void create() {
        MPDelivery delivery = FactoryMPDelivery.getMPDelivery();
        deliveryRepository.create(delivery);

        assertNotNull(deliveryRepository.getAll());
    }

    @Test
    public void read() {
        MPDelivery delivery = FactoryMPDelivery.getMPDelivery();
        deliveryRepository.create(delivery);

        assertNotNull(deliveryRepository.getAll());

        MPDelivery deliveryInSet =deliveryRepository.read(delivery.getMpDeliveId());

        assertEquals(delivery,deliveryInSet);
    }

    @Test
    public void delete() {

        MPDelivery delivery = FactoryMPDelivery.getMPDelivery();
        deliveryRepository.create(delivery);


        assertNotNull(deliveryRepository.getAll());

        deliveryRepository.delete(delivery.getMpDeliveId());


        MPDelivery updatedVersion = deliveryRepository.read(delivery.getMpDeliveId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        MPDelivery delivery = FactoryMPDelivery.getMPDelivery();
        deliveryRepository.create(delivery);


        MPDelivery deliveryUpdate = FactoryMPDelivery.getMPDelivery();
        deliveryUpdate.setMpDeliveId(delivery.getMpDeliveId());
        deliveryRepository.update(deliveryUpdate);


        MPDelivery updatedVersion = deliveryRepository.read(deliveryUpdate.getMpDeliveId());

        assertEquals(deliveryUpdate, updatedVersion);
    }

}