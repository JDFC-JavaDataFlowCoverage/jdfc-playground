package com.jdfc.interprocedural;

public class ReturnStatic {

    public void test() {
        System.out.println(test1(3));
    }

    public int test1(int x) {
        if (x > 100) {
            return add1(x);
        }
        if (x > 50) {
            return add2(x);
        }
        return add3(x);
    }

    public static int add1(int x) {
        return x + 1;
    }

    public static int add2(int x) {
        return x + 2;
    }

    public static int add3(int x) {
        return x + 3;
    }
}
