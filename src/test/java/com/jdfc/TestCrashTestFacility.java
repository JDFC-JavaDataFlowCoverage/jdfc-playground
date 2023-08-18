package com.jdfc;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestCrashTestFacility {

//    @Test
//    public void test_max() {
//        final CrashTestFacility crashTestFacility = new CrashTestFacility();
//        int result = crashTestFacility.max(23, 42);
//        assertEquals(42, result);
//    }

//    @Test
//    public void test_setDaysWithoutHumanInjury() {
//        final CrashTestFacility crashTestFacility = new CrashTestFacility();
//        crashTestFacility.setDaysWithoutHumanInjury(2);
//        int result = crashTestFacility.getDaysWithoutHumanInjury();
//        assertEquals(2, result);
//    }

    @Test
    public void test_getDaysWithoutHumanInjury() {
        final CrashTestFacility crashTestFacility = new CrashTestFacility();
        int result = crashTestFacility.getDaysWithoutHumanInjury();
        assertEquals(1, result);
    }

//    @Test
//    public void test_createNewDefaultDummy() {
//        final CrashTestFacility crashTestFacility = new CrashTestFacility();
//        final CrashTestDummy actual = crashTestFacility.createNewDefaultDummy();
//    }

//    @Test
//    public void test_createObject() {
//        final CrashTestFacility crashTestFacility = new CrashTestFacility();
//        final Object actual = crashTestFacility.createObject();
//    }

//    @Test
//    public void test_addToEveryArrayEl() {
//        final CrashTestFacility crashTestFacility = new CrashTestFacility();
//        final int[] inputArray = {0, 1, 2, 3};
//        final int[] expected = {1, 2, 3, 4};
//        int[] actual = crashTestFacility.addToEveryArrayEl(1, inputArray);
//        assertArrayEquals(expected, actual);
//    }

//    @Test
//    public void test_addToEveryListEl() {
//        final CrashDummy crashDummy = new CrashDummy();
//        final List<Integer> inputList = Arrays.asList(0, 1, 2, 3);
//        final List<Integer> expected = Arrays.asList(1, 2, 3, 4);
//        List<Integer> actual = crashDummy.addToEveryListEl(1, inputList);
//        assertEquals(expected, actual);
//    }
//    @Test
//    public void test_foo() {
//        final BranchingInteger branchingInteger = new BranchingInteger();
//        int result = branchingInteger.foo(4);
//        assertEquals(4, result);
//    }
//
//    @Test
//    public void test_callFoo() {
//        final CrashTestFacility crashTestFacility = new CrashTestFacility();
//        final int result = crashTestFacility.callFoo(1);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void test_loop() {
//        final BranchingInteger branchingInteger = new BranchingInteger();
//        final int result = branchingInteger.loop();
//        assertEquals(3, result);
//    }

//    @Test
//    public void test_getInterface() {
//        final BranchingInteger branchingInteger = new BranchingInteger();
//        JDFCInterface result = branchingInteger.getInterface();
//        assertEquals("Hello", result.getString());
//    }

//    @Test
//    public void test_read() {
//        final BranchingInteger branchingInteger = new BranchingInteger();
//        int result = 0;
//        try {
//            result = branchingInteger.read(new byte[1], 1, 1);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        assertEquals(1, result);
//    }
//
//    @Test
//    public void test_finalize() {
//        final BranchingInteger branchingInteger = new BranchingInteger();
//        try {
//            branchingInteger.finalize();
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        }
//        assertEquals(1, 1);
//    }
}
