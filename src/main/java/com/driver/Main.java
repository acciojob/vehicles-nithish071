package com.driver;

public class Main {
    public static void main(String[] args) {
//        F1 mercedes = new F1("mercedes", false);
//        mercedes.move(40, 0);
//        mercedes.accelerate(20);
//        mercedes.accelerate(-60);
//        Vehicle vehicle = new Vehicle("Truck");
//        vehicle.move(10, 45);
//        vehicle.steer(45);
//        vehicle.stop();
//        Car car = new Car("Tata", 4, 4, 4, true, "Sedan");
//        car.move(20, 30);
//        car.steer(45);
//        car.stop();
        F1 f1 = new F1("BMW", false);
        Boolean isManual = f1.isManual;
        f1.accelerate(0);
        f1.accelerate(50);
        f1.accelerate(25);
        f1.accelerate(50);
        f1.accelerate(26);
        f1.accelerate(99);
        f1.accelerate(1);
        System.out.println(f1.getCurrentDirection());
        System.out.println(f1.getCurrentSpeed());
        System.out.println(f1.getCurrentGear());
    }
}