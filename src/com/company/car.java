package com.company;

public class car extends Vehicle
{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public car(String name, int size, int model, int wheels, int doors, int gears, boolean isManual)
    {
        super(name, size, model);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.setCurrentGear : "+this.currentGear+" gear.");
    }

    public void changeVelocity(int speed, int direction)
    {
        System.out.println("car,changeVelocity() : velocity "+speed+" and direction "+direction);
        move(speed,direction);
    }

//    @Override
//    public void stop()
//    {
//
//    }

}
