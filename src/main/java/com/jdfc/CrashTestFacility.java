package com.jdfc;

public class CrashTestFacility {

    int daysWithoutHumanInjury = 1;

    CrashTestDummy dummy = new CrashTestDummy("Bert", 1, 70);

    public CrashTestFacility() {
    }

    public CrashTestFacility(int value) {
       this.daysWithoutHumanInjury = value;
       this.dummy = new CrashTestDummy("Bill", 2, 100);
    }
//
//    public void requestHelpFromSystemSupport() {
//        // do nothing
//    }
//
//    public int requestDaysWithoutAccident() {
//        return 0;
//    }
//
//    public void setDaysWithoutHumanInjury(int value) {
//        this.daysWithoutHumanInjury = value;
//    }

    public int getDaysWithoutHumanInjury() {
        return daysWithoutHumanInjury;
    }

    public CrashTestDummy getDummy() {
        return dummy;
    }

    //--- Array --------------------------------------------------------------------------------------------------------
//    public int[] addToEveryArrayEl(int x, int[] inputArray) {
//        int[] newArray = new int[inputArray.length];
//        for(int i = 0; i < newArray.length; i++) {
//            newArray[i] = inputArray[i] + x;
//        }
//        return newArray;
//    }
//
//    public List<Integer> addToEveryListEl(int x, List<Integer> inputList) {
//        List<Integer> newList = new ArrayList<>(inputList.size());
//        for(Integer y : inputList) {
//            newList.add(y + x);
//        }
//        return newList;
//    }

    //--- Object -------------------------------------------------------------------------------------------------------
//    public CrashTestDummy createNewDefaultDummy() {
//        return new CrashTestDummy("dummy", 0, 80.0);
//    }
//
//    public Object createObject() {
//        return new Object();
//    }
//
//    public void catchException() {
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//           System.out.println("Exception caught.");
//        }
//    }
//
//    public CrashTestDummy createNewDummy(double weight) {
//        return new CrashTestDummy("dummy", 0, weight);
//    }
//
//    public CrashTestDummy createWeightClassifiedDummy(boolean isHeavy) {
//        CrashTestDummy dummy;
//        if(isHeavy) {
//            dummy = new CrashTestDummy("heavy_dummy", 0, 100.0);
//        } else {
//            dummy = new CrashTestDummy("heavy_dummy", 0, 60.0);
//        }
//        return dummy;
//    }
//
//    public void addWeight(CrashTestDummy dummy, double weight) {
//        dummy.setWeight(dummy.getWeight() + weight);
//    }

//    public void addWeightPublic(CrashTestDummy dummy, double weight) {
//        dummy.weight = dummy.weight + weight;
//    }

//    public CrashTestDummy duplicateDummy(CrashTestDummy dummy) {
//        return new CrashTestDummy(dummy.getName(), dummy.getAge(), dummy.getWeight());
//    }
//
//    public CrashTestDummy duplicateDummyPublic(CrashTestDummy dummy) {
//        return new CrashTestDummy(dummy.name, dummy.age, dummy.weight);
//    }
//    public int gt(int a, int b) {
//        if(a < b) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }

//    public int max(int a, int b) {
//        // This is a comment
//        int result = 0;
//        if (a < b) {
//            result = b;
//        } else {
//            result = a;
//        }
//        return result;
//    }

//    public int sign(int number) {
//        if (number > 0) {
//            return 1;
//        } else if (number < 0) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
//
//    public void printNumbers(int n) {
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//        }
//    }
//
//    public void countdown(int start) {
//        while (start > 0) {
//            System.out.println(start);
//            start--;
//        }
//        System.out.println("Blast off!");
//    }
//
//    public void sumNumbers(int n) {
//        int sum = 0;
//        int i = 1;
//        do {
//            sum += i;
//            i++;
//        } while (i <= n);
//        System.out.println("Sum: " + sum);
//    }
//
//    public void checkDayOfWeek(int day) {
//        switch (day) {
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }
//    }
//
//    public int foo(int x, int y, String z) {
//        System.out.println(z);
//        if (x > y) {
//            return x;
//        } else {
//            return x + 1;
//        }
//    }
//
//    public int callFoo(int bar) {
//        return foo(loop(), bar, "hepp");
//    }
//
//    public int loop() {
//        int result = 0;
//        for (int i = 0; i < 3; i++) {
//            result++;
//        }
//        return result;
//    }
//
//    public int sum(int a, int b) {
//        return a + b;
//    }
//
//    //--- Call ---------------------------------------------------------------------------------------------------------
//
//    public int callMax() {
//        int a = 3;
//        int b = this.max(a, 2);
//        int c = a + b;
//
//        return c;
//    }
//
//    public int callSum() {
//        int a = 3;
//        int b = this.sum(a, 2);
//
//        return a + b;
//    }
//
//    //--- Static call --------------------------------------------------------------------------------------------------
//
//    public static boolean isBiggerThan3(int x) {
//        return x > 3;
//    }
//
//    public int callIsBiggerThan3(int x) {
//        if(isBiggerThan3(x)) {
//            return 199;
//        } else {
//            return 200;
//        }
//    }
//
    //--- Call loop ----------------------------------------------------------------------------------------------------

//    public int addOne(int x) {
//        if (x < 100) {
//            x = x + 1;
//            return addTwo(x);
//        } else {
//           return x;
//        }
//    }
//
//    public int addTwo(int x) {
//        if (x < 100) {
//            x = x + 1;
//            return addThree(x);
//        } else {
//            return x;
//        }
//    }
//
//    public int addThree(int x) {
//        if (x < 100) {
//            x = x + 1;
//            return addOne(x);
//        } else {
//            return x;
//        }
//    }

//    //--- Recursion ----------------------------------------------------------------------------------------------------
//
//    public int recursive(int x) {
//        if (x < 10) {
//            x = x + 1;
//            return recursive(x);
//        } else {
//            return x;
//        }
//    }
//
//
//    //--- Calling another class ----------------------------------------------------------------------------------------
//
//    public int callChat(int x) {
//        return SimpleInteger.chat(x);
//    }
}


