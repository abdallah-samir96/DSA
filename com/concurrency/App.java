package com.concurrency;

public class App {
    public static void main(String[] args) throws InterruptedException {
        var car = new Car(100, "BMW");
        synchronized(car) {
            System.out.println("Before the Object");
            car.wait();
            System.out.println("After the Object");
        }
        synchronized (car) {
            car.notify();
        }
        System.out.println("Outside Synchronized");
    }
}
class Car {
    private int speed;
    private String category;

    public Car(int speed, String category) {
        this.speed = speed;
        this.category = category;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}