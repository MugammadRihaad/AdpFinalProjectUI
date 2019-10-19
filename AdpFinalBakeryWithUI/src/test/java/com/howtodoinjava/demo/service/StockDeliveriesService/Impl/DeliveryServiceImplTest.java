package com.howtodoinjava.demo.service.StockDeliveriesService.Impl;

import com.howtodoinjava.demo.domain.StockDeliveries.Deliveries;
import com.howtodoinjava.demo.factory.StockDeliveries.FactoryDeliveries;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeliveryServiceImplTest {





    @Autowired
    private DeliveryServiceImpl deliveryService;


    @Test
    public void create() {
        Deliveries delivery = FactoryDeliveries.getDeliveries("Game",200,3000);
        deliveryService.create(delivery);

        assertNotNull(deliveryService.getAll());
    }

    @Test
    public void read() {

        Deliveries delivery = FactoryDeliveries.getDeliveries("Game",200,3000);
        deliveryService.create(delivery);

        assertNotNull(deliveryService.getAll());

        Deliveries deliveryInSet =deliveryService.read(delivery.getDelivId());

        assertEquals(delivery,deliveryInSet);
    }

    @Test
    public void delete() {

        Deliveries delivery = FactoryDeliveries.getDeliveries("Game",200,3000);
        deliveryService.create(delivery);



        assertNotNull(deliveryService.getAll());

        deliveryService.delete(delivery.getDelivId());


        Deliveries updatedVersion = deliveryService.read(delivery.getDelivId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {
        Deliveries delivery = FactoryDeliveries.getDeliveries("Game",200,3000);
        deliveryService.create(delivery);


        Deliveries deliveryUpdate = FactoryDeliveries.getDeliveries("Osmans",300,50);
        deliveryUpdate.setDelivId(delivery.getDelivId());
        deliveryService.update(deliveryUpdate);


        Deliveries updatedVersion = deliveryService.read(deliveryUpdate.getDelivId());

        assertEquals(deliveryUpdate, updatedVersion);
    }
}