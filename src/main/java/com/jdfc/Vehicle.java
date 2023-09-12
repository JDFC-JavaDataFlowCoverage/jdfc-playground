package com.jdfc;

public class Vehicle {
    private String type;

    public enum FuelType {
        PETROL, DIESEL, ELECTRIC;
    }

    public class Engine {
        public void start() {
            System.out.println("Engine starting...");
        }
    }

    public Vehicle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
