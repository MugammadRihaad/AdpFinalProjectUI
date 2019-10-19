package com.howtodoinjava.demo.repository.TownRepo.Impl;

import com.howtodoinjava.demo.domain.Town.TownDelivery;
import com.howtodoinjava.demo.factory.Town.FactoryTownDelivery;
import com.howtodoinjava.demo.repository.TownRepo.TownDeliveryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TownDeliveryRepositoryImplTest {

    @Autowired
    private TownDeliveryRepository deliveryRepository;


    @Test
    public void create() {
        TownDelivery delivery = FactoryTownDelivery.getTownDelivery();
        deliveryRepository.create(delivery);

        assertNotNull(deliveryRepository.getAll());
    }

    @Test
    public void read() {
        TownDelivery delivery = FactoryTownDelivery.getTownDelivery();
        deliveryRepository.create(delivery);

        assertNotNull(deliveryRepository.getAll());

        TownDelivery deliveryInSet =deliveryRepository.read(delivery.getTnDeliveId());

        assertEquals(delivery,deliveryInSet);
    }

    @Test
    public void delete() {

        TownDelivery delivery = FactoryTownDelivery.getTownDelivery();
        deliveryRepository.create(delivery);


        assertNotNull(deliveryRepository.getAll());

        deliveryRepository.delete(delivery.getTnDeliveId());


        TownDelivery updatedVersion = deliveryRepository.read(delivery.getTnDeliveId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        TownDelivery delivery = FactoryTownDelivery.getTownDelivery();
        deliveryRepository.create(delivery);


        TownDelivery deliveryUpdate = FactoryTownDelivery.getTownDelivery();
        deliveryUpdate.setTnDeliveId(delivery.getTnDeliveId());
        deliveryRepository.update(deliveryUpdate);


        TownDelivery updatedVersion = deliveryRepository.read(deliveryUpdate.getTnDeliveId());

        assertEquals(deliveryUpdate, updatedVersion);
    }


}