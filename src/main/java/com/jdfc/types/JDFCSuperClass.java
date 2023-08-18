package com.jdfc.types;

public class JDFCSuperClass implements JDFCInterface {

    int basicInt;
    short basicShort;
    long basicLong;
    double basicDouble;
    boolean basicBoolean;
    char basicChar;
    byte basicByte;

    Integer intWrapper;
    Short shortWrapper;
    Long longWrapper;
    Double doubleWrapper;
    Boolean booleanWrapper;
    Character charWrapper;
    Byte byteWrapper;
    String string;

    int[] intArray;
    short[] shortArray;
    long[] longArray;
    double[] doubleArray;
    boolean[] booleanArray;
    char[] charArray;
    byte[] byteArray;

    int[][] intMatrix;
    short[][] shortMatrix;
    long[][] longMatrix;
    double[][] doubleMatrix;
    boolean[][] booleanMatrix;
    char[][] charMatrix;
    byte[][] byteMatrix;

    public JDFCSuperClass(String string) {
        this.string = string;
    }

    public class JDFCInnerClass {
        private String innerField;

        // Constructor for InnerClass
        public JDFCInnerClass(String innerField) {
            this.innerField = innerField;
        }

        // Getter for innerField
        public String getInnerField() {
            return innerField;
        }
    }

    public class JDFCNestedClass {
        private String nestedField;

        // Constructor for NestedClass
        public JDFCNestedClass(String nestedField) {
            this.nestedField = nestedField;
        }

        // Getter for nestedField
        public String getNestedField() {
            return nestedField;
        }
    }

    @Override
    public String getString() {
        return string;
    }
}
