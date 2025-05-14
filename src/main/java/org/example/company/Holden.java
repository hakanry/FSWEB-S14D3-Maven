package org.example.company;

public class Holden  extends  Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String  startEngine(){
        return getClass().getSimpleName()+" the car's engine is starting";

    }
    public String accelerate(){
        return getClass().getSimpleName()+" the car is accelerating";
    }
    public String brake(){
        return getClass().getSimpleName()+" the car is braking";
    }
}
