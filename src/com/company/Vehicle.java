package com.company;
import java.io.*;
import java.security.PrivateKey;
import java.util.*;
public class Vehicle
{
    private String name;
    private int CurrentVel, CurrentDir, size, model;

    public Vehicle(String name, int size, int model)
    {
        this.name = name;
        this.size = size;
        this.model = model;
        this.CurrentVel = 0;
        this.CurrentDir = 0;
    }

    public void Steer(int direction)
    {
        this.CurrentDir += direction;
        System.out.println("Vehicle.Steer() : "+CurrentDir+" degrees.");
    }

    public void move (int velocity, int direction)
    {
        CurrentDir = direction;
        CurrentVel = velocity;
        System.out.println("Vehicle.move() : "+CurrentVel+" kmph in direction "+CurrentDir);
    }

    public String getName() {
        return name;
    }

    public int getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentVel() {
        return CurrentVel;
    }

    public int getCurrentDir() {
        return CurrentDir;
    }

    public void stop()
    {
        this.CurrentVel=0;
    }

    static class base
    {
        public static void main(String[] args) {
            System.out.println("vroom");
        }
    }
}
