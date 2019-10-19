package com.howtodoinjava.demo.repository.TownRepo.Impl;

import com.howtodoinjava.demo.domain.Town.TownBranch;
import com.howtodoinjava.demo.factory.Town.FactoryTownBranch;
import com.howtodoinjava.demo.repository.TownRepo.TownBranchRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TownBranchRepositoryImplTest {

    @Autowired
    private TownBranchRepository branchRepository;


    @Test
    public void create() {
        TownBranch branch = FactoryTownBranch.getTownBranch();
        branchRepository.create(branch);

        assertNotNull(branchRepository.getAll());
    }

    @Test
    public void read() {

        TownBranch branch = FactoryTownBranch.getTownBranch();
        branchRepository.create(branch);

        assertNotNull(branchRepository.getAll());

        TownBranch branchInSet =branchRepository.read(branch.getTnBrId());

        assertEquals(branch,branchInSet);
    }

    @Test
    public void delete() {

        TownBranch branch = FactoryTownBranch.getTownBranch();
        branchRepository.create(branch);


        assertNotNull(branchRepository.getAll());

        branchRepository.delete(branch.getTnBrId());


        TownBranch updatedVersion = branchRepository.read(branch.getTnBrId());

        assertNull(updatedVersion);
    }

    @Test
    public void update() {

        TownBranch branch = FactoryTownBranch.getTownBranch();
        branchRepository.create(branch);


        TownBranch branchUpdate = FactoryTownBranch.getTownBranch();
        branchUpdate.setTnBrId(branch.getTnBrId());
        branchRepository.update(branchUpdate);


        TownBranch updatedVersion = branchRepository.read(branchUpdate.getTnBrId());

        assertEquals(branchUpdate, updatedVersion);
    }


}