package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        camero newCamero = new camero(36);
        newCamero.Steer(0);
        newCamero.accel(10);
        newCamero.accel(-3);
        newCamero.Steer(90);
        newCamero.accel(25);
        newCamero.Steer(45);
        newCamero.accel(35);
        newCamero.Steer(0);
        newCamero.accel(55);
        newCamero.accel(69);
    }
}
