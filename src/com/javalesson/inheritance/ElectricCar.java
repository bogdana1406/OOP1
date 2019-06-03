package com.javalesson.inheritance;

public class ElectricCar extends Auto {

    private int butteryVolume;
    private int passengersNumber;

    public ElectricCar(String producer, String model, int butteryVolume, int passengersNumber) {
        super(producer, model, new Engine());
        this.butteryVolume = butteryVolume;
        this.passengersNumber = passengersNumber;
    }

    public int getButteryVolume() {
        return butteryVolume;
    }

    public void setButteryVolume(int butteryVolume) {
        this.butteryVolume = butteryVolume;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public void charge() {
        System.out.println("Battery is charging");
    }
}
