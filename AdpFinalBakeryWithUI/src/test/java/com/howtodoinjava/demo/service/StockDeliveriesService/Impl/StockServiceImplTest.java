package com.howtodoinjava.demo.service.StockDeliveriesService.Impl;

import com.howtodoinjava.demo.domain.StockDeliveries.Stock;
import com.howtodoinjava.demo.factory.StockDeliveries.FactoryStock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockServiceImplTest {




    @Autowired
    private StockServiceImpl stockService;


    @Test
    public void create() {
        Stock stock = FactoryStock.getStock("food",200,5.3);
        stockService.create(stock);

        assertNotNull(stockService.getAll());
    }

    @Test
    public void read() {

        Stock stock = FactoryStock.getStock("food",200,5.3);
        stockService.create(stock);

        assertNotNull(stockService.getAll());

        Stock stockInSet =stockService.read(stock.getStockId());

        assertEquals(stock,stockInSet);
    }

    @Test
    public void delete() {

        Stock stock = FactoryStock.getStock("food",200,5.3);
        stockService.create(stock);

        assertNotNull(stockService.getAll());

        stockService.delete(stock.getStockId());


        Stock updatedVersion = stockService.read(stock.getStockId());


    }

    @Test
    public void update() {

        Stock stock = FactoryStock.getStock("food",200,5.3);
        stockService.create(stock);



        Stock stockUpdate = FactoryStock.getStock("utensils",300,0.4);
        stockUpdate.setStockId(stock.getStockId());
        stockService.update(stockUpdate);


        Stock updatedVersion = stockService.read(stock.getStockId());

        assertEquals(stockUpdate, updatedVersion);
    }

}