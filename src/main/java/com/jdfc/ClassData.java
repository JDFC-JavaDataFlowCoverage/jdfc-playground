package com.jdfc;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ClassData {

    public ClassData() {
    }

    public Map<String, Integer> getTestData() {
        return testData;
    }

    private static Map<String, Integer> testData;

    public static void init_test_data() {
        if (testData == null) {
            testData = new ConcurrentHashMap<>();
        }
    }

    public static void track(String value) {
        init_test_data();
        testData.put(value, 0);
    }

    public static Map<String, Integer> get_and_reset() {
        Map<String, Integer> local = testData;
        testData = new ConcurrentHashMap<>();
        return local;
    }
}
