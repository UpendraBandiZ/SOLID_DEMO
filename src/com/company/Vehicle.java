package com.company;

public class Vehicle implements Accelerator,Engine,Brake,VehicleInfo {

    @Override
    public void accelerate(){
        System.out.println("vehicle acceleration method called");
    }
    @Override
    public  void applyBrake(){
        System.out.println("vehicle brakes applied");
    }
    @Override
    public void startEngine(){
        System.out.println("vehicle engine started");
    }
    @Override
    public void displayVehicleInfo() {
        System.out.println("vehicle information displayed");
    }
}
