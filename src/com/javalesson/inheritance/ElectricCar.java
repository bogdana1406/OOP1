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

    private void charge() {
        System.out.println("Battery is charging");
    }

    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Car is starting");
    }

    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Car has stopped");
    }

    @Override
    public void energize() {
        charge();
    }
}
