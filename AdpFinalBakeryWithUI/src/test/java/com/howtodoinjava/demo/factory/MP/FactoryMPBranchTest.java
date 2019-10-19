package com.howtodoinjava.demo.factory.MP;


import com.howtodoinjava.demo.domain.MP.MPBranch;
import org.junit.Assert;
import org.junit.Test;

public class FactoryMPBranchTest {

    @Test
    public void getMPBranch() {


        MPBranch hd=FactoryMPBranch.getMPBranch();

        Assert.assertNotNull(hd);

    }
    }
