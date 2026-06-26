package com.vishal;

class BoilWater extends Thread {
    public void run() {
        System.out.println("Boiling Water");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Water is Ready");
    }
}

class BoilMilk extends Thread {
    public void run() {
        System.out.println("Boiling Milk");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Milk is Ready");
    }
}

class GrindCoffee extends Thread {
    public void run() {
        System.out.println("Grinding Coffee Beans");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Coffee Powder is Ready");
    }
}

public class CoffeeMachine {
    public static void main(String[] args) {

        BoilWater water = new BoilWater();
        BoilMilk milk = new BoilMilk();
        GrindCoffee coffee = new GrindCoffee();

        water.start();
        milk.start();
        coffee.start();

        try {
            water.join();
            milk.join();
            coffee.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Coffee Preparation Completed!");
    }
}