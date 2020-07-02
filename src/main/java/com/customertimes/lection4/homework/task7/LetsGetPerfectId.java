package com.customertimes.lection4.homework.task7;

import java.util.Random;

public class LetsGetPerfectId {
    static int id;
    int riderId;
    String riderName;

    {
        System.out.println("in the i1.block");
        riderId = id;
    }

     {
        System.out.println("int the i2.block");
        id++;
    }

    public LetsGetPerfectId(String riderName) {
        this.riderName = riderName;
    }

    public void PrintRiderNameAndId() {
        if (riderId != 2 && riderId != 4) {
            System.out.println("Id Of The rider =" + riderId);
            System.out.println("Name Of The rider =" + riderName);
            System.out.println();
        } else
            System.out.println("This rider id is 2 or 4 :(");
    }

    public static void main(String[] args) {
        LetsGetPerfectId Tesla = new LetsGetPerfectId("Tesla");
        LetsGetPerfectId Vasja = new LetsGetPerfectId("Vaska");
        LetsGetPerfectId Katerina = new LetsGetPerfectId("Katerina");
        LetsGetPerfectId Balerina = new LetsGetPerfectId("Balerina");
        LetsGetPerfectId Kote = new LetsGetPerfectId("Kote");
       Tesla.PrintRiderNameAndId();
       Vasja.PrintRiderNameAndId();
       Katerina.PrintRiderNameAndId();
       Balerina.PrintRiderNameAndId();
       Kote.PrintRiderNameAndId();

    }
}


