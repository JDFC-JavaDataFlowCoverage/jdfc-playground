package com.jdfc.interprocedural;

public class Switch {

    public void test() {
        System.out.println(test1(1, 50, "asdf"));
    }

    public int test1(int x, int y, String str) {
        switch (x) {
            case 1:
            case 2:
                if (y < 100) {
                    try {
                        return add1(str);
                    } catch (IllegalArgumentException e) {
                        // no int
                    }
                    return add3(str);
                }
                throw new IllegalArgumentException();
            case 3:
            case 4:
                try {
                    int z = add1(str);
                    if (z < 100) {
                        return z;
                    }
                } catch (IllegalArgumentException e) {
                    // Don't care
                }
                // $fall
            default:
                return x;
        }
    }

    public static int add1(String str) throws IllegalArgumentException {
        try {
            return Integer.parseInt(str) + 1;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    public static int add3(String str) {
        try {
            return Integer.parseInt(str) + 3;
        } catch (NumberFormatException e) {
            return 3;
        }
    }
}
