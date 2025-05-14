package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CarSkeleton() {
    }
    public void startEngine(){
        System.out.println("CARSKELETON STARTENGINE METHOD");
    }
    public void drive(){
        runEngine();
        System.out.println("CARSKELETON DRIVE METHOD");
    }
    protected void runEngine(){
        System.out.println("CARSKELETON PROTECTED RUNENGINE METHOD");
    }
}
