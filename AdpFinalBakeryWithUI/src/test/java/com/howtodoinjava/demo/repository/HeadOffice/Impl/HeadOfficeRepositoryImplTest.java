package com.howtodoinjava.demo.repository.HeadOffice.Impl;


import com.howtodoinjava.demo.domain.HeadOffice;
import com.howtodoinjava.demo.factory.HeadOffice.FactoryHeadOffice;
import com.howtodoinjava.demo.repository.HeadOffice.HeadOfficeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeadOfficeRepositoryImplTest {

    @Autowired
    private HeadOfficeRepository officeRepository;



    @Test
    public void create() {
        HeadOffice office = FactoryHeadOffice.getHeadOffice();
        officeRepository.create(office);

        assertNotNull(officeRepository.getAll());
    }

    @Test
    public void read() {

        HeadOffice office = FactoryHeadOffice.getHeadOffice();
        officeRepository.create(office);

        assertNotNull(officeRepository.getAll());

        HeadOffice officeInSet =officeRepository.read(office.getOfficeId());

        assertEquals(office,officeInSet);
    }

    @Test
    public void delete() {

        HeadOffice office = FactoryHeadOffice.getHeadOffice();
        officeRepository.create(office);


        assertNotNull(officeRepository.getAll());

        officeRepository.delete(office.getOfficeId());


        HeadOffice updatedVersion = officeRepository.read(office.getOfficeId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        HeadOffice office = FactoryHeadOffice.getHeadOffice();
        officeRepository.create(office);


        HeadOffice officeUpdate = FactoryHeadOffice.getHeadOffice();
        officeUpdate.setBellvilleBrId(office.getBellvilleBrId());
        officeRepository.update(officeUpdate);


        HeadOffice updatedVersion = officeRepository.read(officeUpdate.getOfficeId());

        assertNull(updatedVersion);
    }


}