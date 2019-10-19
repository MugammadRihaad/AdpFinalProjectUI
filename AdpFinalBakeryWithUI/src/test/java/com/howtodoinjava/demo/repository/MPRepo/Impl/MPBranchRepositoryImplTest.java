package com.howtodoinjava.demo.repository.MPRepo.Impl;

import com.howtodoinjava.demo.domain.MP.MPBranch;
import com.howtodoinjava.demo.factory.MP.FactoryMPBranch;
import com.howtodoinjava.demo.repository.MPRepo.MPBranchRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MPBranchRepositoryImplTest {

    @Autowired
    private MPBranchRepository branchRepository;


    @Test
    public void create() {
        MPBranch branch = FactoryMPBranch.getMPBranch();
        branchRepository.create(branch);

        assertNotNull(branchRepository.getAll());
    }

    @Test
    public void read() {
        MPBranch branch = FactoryMPBranch.getMPBranch();
        branchRepository.create(branch);

        assertNotNull(branchRepository.getAll());

        MPBranch branchInSet =branchRepository.read(branch.getMpBrId());

        assertEquals(branch,branchInSet);
    }

    @Test
    public void delete() {

        MPBranch branch = FactoryMPBranch.getMPBranch();
        branchRepository.create(branch);


        assertNotNull(branchRepository.getAll());

        branchRepository.delete(branch.getMpBrId());


        MPBranch updatedVersion = branchRepository.read(branch.getMpBrId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        MPBranch branch = FactoryMPBranch.getMPBranch();
        branchRepository.create(branch);


        MPBranch branchUpdate = FactoryMPBranch.getMPBranch();
        branchUpdate.setMpBrId(branch.getMpBrId());
        branchRepository.update(branchUpdate);


        MPBranch updatedVersion = branchRepository.read(branchUpdate.getMpBrId());

        assertEquals(branchUpdate, updatedVersion);
    }


}