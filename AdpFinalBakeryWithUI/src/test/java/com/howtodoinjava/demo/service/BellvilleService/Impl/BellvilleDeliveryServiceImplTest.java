package com.howtodoinjava.demo.service.BellvilleService.Impl;

import com.howtodoinjava.demo.domain.Bellville.BellvilleDelivery;
import com.howtodoinjava.demo.factory.Bellville.FactoryBellvilleDelivery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BellvilleDeliveryServiceImplTest {

    @Autowired
    private BellvilleDeliveryServiceImpl deliveryService;


    @Test
    public void create() {
        BellvilleDelivery delivery = FactoryBellvilleDelivery.getBellvilleDelivery();
        deliveryService.create(delivery);

        assertNotNull(deliveryService.getAll());
    }

    @Test
    public void read() {

        BellvilleDelivery delivery = FactoryBellvilleDelivery.getBellvilleDelivery();
        deliveryService.create(delivery);

        assertNotNull(deliveryService.getAll());

        BellvilleDelivery deliveryInSet =deliveryService.read(delivery.getBellDeliveId());

        assertEquals(delivery,deliveryInSet);
    }

    @Test
    public void delete() {

        BellvilleDelivery delivery = FactoryBellvilleDelivery.getBellvilleDelivery();
        deliveryService.create(delivery);


        assertNotNull(deliveryService.getAll());

        deliveryService.delete(delivery.getBellDeliveId());


        BellvilleDelivery updatedVersion = deliveryService.read(delivery.getBellDeliveId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        BellvilleDelivery delivery = FactoryBellvilleDelivery.getBellvilleDelivery();
        deliveryService.create(delivery);


        BellvilleDelivery deliveryUpdate = FactoryBellvilleDelivery.getBellvilleDelivery();
        deliveryUpdate.setBellDeliveId(delivery.getBellDeliveId());
        deliveryService.update(deliveryUpdate);


        BellvilleDelivery updatedVersion = deliveryService.read(deliveryUpdate.getBellDeliveId());

        assertEquals(deliveryUpdate, updatedVersion);
    }
}