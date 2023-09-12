package com.jdfc;

public class LoopExample {
    public void printEvenNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
