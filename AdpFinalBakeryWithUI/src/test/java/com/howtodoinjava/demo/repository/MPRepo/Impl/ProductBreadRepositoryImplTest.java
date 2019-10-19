package com.howtodoinjava.demo.repository.MPRepo.Impl;

import com.howtodoinjava.demo.domain.MP.ProductBread;
import com.howtodoinjava.demo.factory.MP.FactoryProductBread;
import com.howtodoinjava.demo.repository.MPRepo.ProductBreadRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductBreadRepositoryImplTest {

    @Autowired
    private ProductBreadRepository breadRepository;



    @Test
    public void create() {
        ProductBread bread = FactoryProductBread.getProductBread("brown",10);
        breadRepository.create(bread);

        assertNotNull(breadRepository.getAll());
    }

    @Test
    public void read() {

        ProductBread bread = FactoryProductBread.getProductBread("brown",10);
        breadRepository.create(bread);

        assertNotNull(breadRepository.getAll());

        ProductBread breadInSet =breadRepository.read(bread.getProductBreadId());

        assertEquals(bread,breadInSet);
    }

    @Test
    public void delete() {


        ProductBread bread = FactoryProductBread.getProductBread("brown",10);
        breadRepository.create(bread);


        assertNotNull(breadRepository.getAll());

        breadRepository.delete(bread.getProductBreadId());


        ProductBread updatedVersion = breadRepository.read(bread.getProductBreadId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {
        ProductBread bread = FactoryProductBread.getProductBread("brown",10);
        breadRepository.create(bread);



        ProductBread breadUpdate = FactoryProductBread.getProductBread("WholeWheat",20);
        breadUpdate.setProductBreadId(bread.getProductBreadId());
        breadRepository.update(breadUpdate);


        ProductBread updatedVersion = breadRepository.read(breadUpdate.getProductBreadId());

        assertEquals(breadUpdate, updatedVersion);
    }


}