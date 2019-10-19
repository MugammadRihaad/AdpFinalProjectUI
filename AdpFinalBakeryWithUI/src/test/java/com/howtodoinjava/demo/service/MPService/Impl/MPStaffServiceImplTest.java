package com.howtodoinjava.demo.service.MPService.Impl;

import com.howtodoinjava.demo.domain.MP.MPStaff;
import com.howtodoinjava.demo.factory.MP.FactoryMPStaff;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MPStaffServiceImplTest {



    @Autowired
    private MPStaffServiceImpl staffService;

    @Test
    public void create() {
        MPStaff staff = FactoryMPStaff.getMPStaff();
        staffService.create(staff);

        assertNotNull(staffService.getAll());
    }

    @Test
    public void read() {

        MPStaff staff = FactoryMPStaff.getMPStaff();
        staffService.create(staff);

        assertNotNull(staffService.getAll());

        MPStaff staffInSet =staffService.read(staff.getMpStaffId());

        assertEquals(staff,staffInSet);
    }

    @Test
    public void delete() {
        MPStaff staff = FactoryMPStaff.getMPStaff();
        staffService.create(staff);


        assertNotNull(staffService.getAll());

        staffService.delete(staff.getMpStaffId());


        MPStaff updatedVersion = staffService.read(staff.getMpStaffId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        MPStaff staff = FactoryMPStaff.getMPStaff();
        staffService.create(staff);


        MPStaff staffUpdate = FactoryMPStaff.getMPStaff();
        staffUpdate.setMpAccountId(staff.getMpAccountId());
        staffService.update(staffUpdate);


        MPStaff updatedVersion = staffService.read(staffUpdate.getMpStaffId());


    }
}