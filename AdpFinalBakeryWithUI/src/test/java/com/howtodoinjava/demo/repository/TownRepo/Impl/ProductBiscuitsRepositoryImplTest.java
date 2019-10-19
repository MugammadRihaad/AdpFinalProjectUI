package com.howtodoinjava.demo.repository.TownRepo.Impl;

import com.howtodoinjava.demo.domain.Town.ProductBiscuits;
import com.howtodoinjava.demo.factory.Town.FactoryProductBiscuits;
import com.howtodoinjava.demo.repository.TownRepo.ProductBiscuitsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductBiscuitsRepositoryImplTest {
    @Autowired
    private ProductBiscuitsRepository biscuitsRepository;



    @Test
    public void create() {
        ProductBiscuits biscuits = FactoryProductBiscuits.getProductBiscuits("raisin",10);
        biscuitsRepository.create(biscuits);

        assertNotNull(biscuitsRepository.getAll());
    }

    @Test
    public void read() {

        ProductBiscuits biscuits = FactoryProductBiscuits.getProductBiscuits("raisin",10);
        biscuitsRepository.create(biscuits);

        assertNotNull(biscuitsRepository.getAll());

        ProductBiscuits biscuitsInSet =biscuitsRepository.read(biscuits.getProductBiscuitsId());

        assertEquals(biscuits,biscuitsInSet);
    }

    @Test
    public void delete() {


        ProductBiscuits biscuits = FactoryProductBiscuits.getProductBiscuits("raisin",10);
        biscuitsRepository.create(biscuits);


        assertNotNull(biscuitsRepository.getAll());

        biscuitsRepository.delete(biscuits.getProductBiscuitsId());


        ProductBiscuits updatedVersion = biscuitsRepository.read(biscuits.getProductBiscuitsId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {
        ProductBiscuits biscuits = FactoryProductBiscuits.getProductBiscuits("raisin",10);
        biscuitsRepository.create(biscuits);


        ProductBiscuits biscuitsUpdate = FactoryProductBiscuits.getProductBiscuits("ChocChip",20);
        biscuitsUpdate.setProductBiscuitsId(biscuits.getProductBiscuitsId());
        biscuitsRepository.update(biscuitsUpdate);


        ProductBiscuits updatedVersion = biscuitsRepository.read(biscuitsUpdate.getProductBiscuitsId());

        assertEquals(biscuitsUpdate, updatedVersion);
    }


}