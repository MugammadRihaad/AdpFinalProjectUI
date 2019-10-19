package com.howtodoinjava.demo.repository.StockDeliveriesRepo.Impl;

import com.howtodoinjava.demo.domain.StockDeliveries.StockDeliveries;
import com.howtodoinjava.demo.factory.StockDeliveries.FactoryStockDeliveries;
import com.howtodoinjava.demo.repository.StockDeliveriesRepo.StockDeliveriesRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockDeliveriesRepositoryImplTest {

    @Autowired
    private StockDeliveriesRepository stockDeliveryRepository;


    @Test
    public void create() {
        StockDeliveries stockDelivery = FactoryStockDeliveries.getStockDeliveries("consoles","23c");
        stockDeliveryRepository.create(stockDelivery);

        assertNotNull(stockDeliveryRepository.getAll());
    }

    @Test
    public void read() {
        StockDeliveries stockDelivery = FactoryStockDeliveries.getStockDeliveries("consoles","23c");
        stockDeliveryRepository.create(stockDelivery);

        assertNotNull(stockDeliveryRepository.getAll());

        StockDeliveries stockDeliveryInSet =stockDeliveryRepository.read(stockDelivery.getDelId());

        assertNull(stockDeliveryInSet);
    }

    @Test
    public void delete() {

        StockDeliveries stockDelivery = FactoryStockDeliveries.getStockDeliveries("consoles","23c");
        stockDeliveryRepository.create(stockDelivery);


        assertNotNull(stockDeliveryRepository.getAll());

        stockDeliveryRepository.delete(stockDelivery.getDelId());


        StockDeliveries updatedVersion = stockDeliveryRepository.read(stockDelivery.getDelId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        StockDeliveries stockDelivery = FactoryStockDeliveries.getStockDeliveries("consoles","23c");
        stockDeliveryRepository.create(stockDelivery);



        StockDeliveries stockDeliveryUpdate = FactoryStockDeliveries.getStockDeliveries("Fridges","21f");
        stockDeliveryUpdate.setStockdelId(stockDelivery.getDelId());
        stockDeliveryRepository.update(stockDeliveryUpdate);


        StockDeliveries updatedVersion = stockDeliveryRepository.read(stockDelivery.getDelId());

        assertNull(updatedVersion);
    }


}