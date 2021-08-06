package com.company;

public class Main {

    public static void main(String[] args) {

        BiCycle bicycle=new BiCycle();
        bicycle.applyBrake();
        bicycle.displayVehicleInfo();
        Vehicle vehicle=new Vehicle();
        vehicle.accelerate();;
        vehicle.startEngine();
        vehicle.applyBrake();
        vehicle.displayVehicleInfo();
        ElectricBiCycle electricBiCycle=new ElectricBiCycle();
        electricBiCycle.activateElectricMode();

    }
}
