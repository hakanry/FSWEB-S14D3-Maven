package org.example.company;

public class Car {
    private boolean engine;
    private  int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders,String name){
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Ford){
            if(((Ford) obj).getCylinders() == getCylinders() && ((Ford) obj).getName().equals(name)){
                return true;
            }
        }else if(obj instanceof Holden){
            if(((Holden) obj).getCylinders() == getCylinders() && ((Holden) obj).getName().equals(name)){
                return true;
            }
        }else {
            if(((Mitsubishi) obj).getCylinders() == getCylinders() && ((Mitsubishi) obj).getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    public String  startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";

    }
    public String accelerate(){
        System.out.println(getClass().getSimpleName());

        return "the car is accelerating";
    }
    public String brake(){
        System.out.println(getClass().getSimpleName());

        return "the car is braking";
    }
}

