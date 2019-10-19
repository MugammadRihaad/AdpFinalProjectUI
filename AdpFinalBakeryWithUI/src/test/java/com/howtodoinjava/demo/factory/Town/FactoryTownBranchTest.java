package com.howtodoinjava.demo.factory.Town;


import com.howtodoinjava.demo.domain.Town.TownBranch;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTownBranchTest {

    @Test
    public void getTownBranch() {


        TownBranch hd=FactoryTownBranch.getTownBranch();

        Assert.assertNotNull(hd);
    }
    }
