package com.company;

public class BiCycle implements Brake,VehicleInfo
{

    @Override
    public void applyBrake() {
    System.out.println("bicycle brake applied");
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("bicycle info displayed");
    }
}
