package com.howtodoinjava.demo.repository.BellvilleRepo.Impl;


import com.howtodoinjava.demo.domain.Bellville.BellvilleDelivery;
import com.howtodoinjava.demo.factory.Bellville.FactoryBellvilleDelivery;
import com.howtodoinjava.demo.repository.BellvilleRepo.BellvilleDeliveryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BellvilleDeliveryRepositoryImplTest {
    @Autowired
    private BellvilleDeliveryRepository deliveryRepository;


    @Test
    public void create() {
        BellvilleDelivery delivery = FactoryBellvilleDelivery.getBellvilleDelivery();
        deliveryRepository.create(delivery);

        assertNotNull(deliveryRepository.getAll());
    }

    @Test
    public void read() {

        BellvilleDelivery delivery = FactoryBellvilleDelivery.getBellvilleDelivery();
        deliveryRepository.create(delivery);

        assertNotNull(deliveryRepository.getAll());

        BellvilleDelivery deliveryInSet =deliveryRepository.read(delivery.getBellDeliveId());

        assertEquals(delivery,deliveryInSet);
    }

    @Test
    public void delete() {

        BellvilleDelivery delivery = FactoryBellvilleDelivery.getBellvilleDelivery();
        deliveryRepository.create(delivery);


        assertNotNull(deliveryRepository.getAll());

        deliveryRepository.delete(delivery.getBellDeliveId());


        BellvilleDelivery updatedVersion = deliveryRepository.read(delivery.getBellDeliveId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        BellvilleDelivery delivery = FactoryBellvilleDelivery.getBellvilleDelivery();
        deliveryRepository.create(delivery);


        BellvilleDelivery deliveryUpdate = FactoryBellvilleDelivery.getBellvilleDelivery();
        deliveryUpdate.setBellDeliveId(delivery.getBellDeliveId());
        deliveryRepository.update(deliveryUpdate);


        BellvilleDelivery updatedVersion = deliveryRepository.read(deliveryUpdate.getBellDeliveId());

        assertEquals(deliveryUpdate, updatedVersion);
    }


}