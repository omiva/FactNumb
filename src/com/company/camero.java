package com.company;

public class camero extends car
{
    private int roadService;

    public camero(int roadService) {
        super("camero", 5 , 2019, 4, 5, 6, false);
        this.roadService = roadService;
    }

    public void accel(int rate)
    {
        int newVel = getCurrentVel()+ rate;
        if(newVel == 0)
        {
            stop();
            changeGear(1);
        }
        else if(newVel > 0 && newVel <= 10)
        {
            changeGear(1);
        }
        else if(newVel > 10 && newVel<=25)
        {
            changeGear(2);
        }
        else if(newVel > 25 && newVel <= 37)
        {
            changeGear(3);
        }
        else if(newVel > 37 && newVel <= 59)
        {
            changeGear(4);
        }
        else if(newVel > 59 && newVel <= 69)
        {
            changeGear(5);
        }
        else if(newVel > 69 && newVel <= 78)
        {
            changeGear(6);
        }

        if(newVel > 0)
        {
            changeVelocity(newVel, getCurrentDir());
        }

    }
}
