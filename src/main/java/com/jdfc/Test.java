package com.jdfc;

public class Test {
    public int gcd(int x, int y) {
        int tmp = 0;
        while (y != 0) {
            tmp = x % y;
            x = y;
            y = tmp;
        }
        return x;
    }
}
