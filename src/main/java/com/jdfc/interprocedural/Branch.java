package com.jdfc.interprocedural;

import java.util.Random;

public class Branch {

    public void defineA() {
        Random random = new Random();
        int a = random.nextInt(1000);
        if (a > 499) {
            defineB(a);
        } else {
            a = random.nextInt(1000);
            defineB(a);
        }
    }

    public void defineB(int a) {
        int b = a + 1;
        if(a > 499) {
            diff(a, b);
        } else {
            sum(a, b);
        }
    }

    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void diff(int a, int b) {
        System.out.println(a - b);
    }

    public int max(int a, int b) {
        int result = 0;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }
}
