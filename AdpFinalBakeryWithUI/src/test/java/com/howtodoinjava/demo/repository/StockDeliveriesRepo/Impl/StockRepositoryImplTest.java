package com.howtodoinjava.demo.repository.StockDeliveriesRepo.Impl;

import com.howtodoinjava.demo.domain.StockDeliveries.Stock;
import com.howtodoinjava.demo.factory.StockDeliveries.FactoryStock;
import com.howtodoinjava.demo.repository.StockDeliveriesRepo.StockRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockRepositoryImplTest {

    @Autowired
    private StockRepository stockRepository;


    @Test
    public void create() {
        Stock stock = FactoryStock.getStock("food",200,5.3);
        stockRepository.create(stock);

        assertNotNull(stockRepository.getAll());
    }

    @Test
    public void read() {

        Stock stock = FactoryStock.getStock("food",200,5.3);
        stockRepository.create(stock);

        assertNotNull(stockRepository.getAll());

        Stock stockInSet =stockRepository.read(stock.getStockId());

        assertEquals(stock,stockInSet);
    }

    @Test
    public void delete() {

        Stock stock = FactoryStock.getStock("food",200,5.3);
        stockRepository.create(stock);

        assertNotNull(stockRepository.getAll());

        stockRepository.delete(stock.getStockId());


        Stock updatedVersion = stockRepository.read(stock.getStockId());

        assertNotNull(updatedVersion);
    }

    @Test
    public void update() {

        Stock stock = FactoryStock.getStock("food",200,5.3);
        stockRepository.create(stock);



        Stock stockUpdate = FactoryStock.getStock("utensils",300,0.4);
        stockUpdate.setStockId(stock.getStockId());
        stockRepository.update(stockUpdate);


        Stock updatedVersion = stockRepository.read(stock.getStockId());

        assertEquals(stockUpdate, updatedVersion);
    }


}