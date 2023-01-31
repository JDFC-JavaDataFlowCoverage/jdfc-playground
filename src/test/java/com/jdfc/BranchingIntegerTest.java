package com.jdfc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BranchingIntegerTest {

    @Test
    public void test_max() {
        final BranchingInteger branchingInteger = new BranchingInteger();
        final int result = branchingInteger.max(23, 42);
        assertEquals(42, result);
    }

//    @Test
//    public void test_foo() {
//        final BranchingInteger branchingInteger = new BranchingInteger();
//        int result = branchingInteger.foo(4);
//        assertEquals(4, result);
//    }

//    @Test
//    public void test_callFoo() {
//        final BranchingInteger branchingInteger = new BranchingInteger();
//        final int result = branchingInteger.callFoo(1);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void test_loop() {
//        final BranchingInteger branchingInteger = new BranchingInteger();
//        final int result = branchingInteger.loop();
//        assertEquals(3, result);
//    }
}
