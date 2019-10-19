package com.howtodoinjava.demo.factory.Bellville;


import com.howtodoinjava.demo.domain.Bellville.BellvilleBranch;
import org.junit.Assert;
import org.junit.Test;

public class FactoryBellvilleBranchTest {

    @Test
    public void getBellvillBranch() {


        BellvilleBranch hd=FactoryBellvilleBranch.getBellvillBranch();

        Assert.assertNotNull(hd);
    }
}