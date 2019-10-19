package com.howtodoinjava.demo.repository.MPRepo.Impl;

import com.howtodoinjava.demo.domain.MP.MPStaff;
import com.howtodoinjava.demo.factory.MP.FactoryMPStaff;
import com.howtodoinjava.demo.repository.MPRepo.MPStaffRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MPStaffRepositoryImplTest {

    @Autowired
    private MPStaffRepository staffRepository;

    @Test
    public void create() {
        MPStaff staff = FactoryMPStaff.getMPStaff();
        staffRepository.create(staff);

        assertNotNull(staffRepository.getAll());
    }

    @Test
    public void read() {

        MPStaff staff = FactoryMPStaff.getMPStaff();
        staffRepository.create(staff);

        assertNotNull(staffRepository.getAll());

        MPStaff staffInSet =staffRepository.read(staff.getMpStaffId());

        assertEquals(staff,staffInSet);
    }

    @Test
    public void delete() {
        MPStaff staff = FactoryMPStaff.getMPStaff();
        staffRepository.create(staff);


        assertNotNull(staffRepository.getAll());

        staffRepository.delete(staff.getMpStaffId());


        MPStaff updatedVersion = staffRepository.read(staff.getMpStaffId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        MPStaff staff = FactoryMPStaff.getMPStaff();
        staffRepository.create(staff);


        MPStaff staffUpdate = FactoryMPStaff.getMPStaff();
        staffUpdate.setMpAccountId(staff.getMpAccountId());
        staffRepository.update(staffUpdate);


        MPStaff updatedVersion = staffRepository.read(staffUpdate.getMpStaffId());

        assertNull(updatedVersion);
    }


}