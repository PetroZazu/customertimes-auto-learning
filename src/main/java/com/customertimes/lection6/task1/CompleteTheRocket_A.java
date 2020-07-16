package com.customertimes.lection6.task1;

public class CompleteTheRocket_A {
    //обявляю два обєкта минулих класів з пустими конструкторами
    private RocketSpeedAndDestination_B sD = new RocketSpeedAndDestination_B();
    private RocketQcProcess_C rQc = new RocketQcProcess_C();

    /*я не впевнений и це вірний підхід, но це єдине як в мене получилося, я додаю поля, що б потім їх переприсвоїти
    для класів Б і С.*/
    private boolean isEngineTested;
    private boolean isCosmonauntsTested;
    private boolean isProgramsTested;
    private int averageRocketSpeed;
    private String rocketDestination;


    // конструктор який в свою чергу буде давати певне значення для полів класів Б і С при об'явленні об'єкту класу А
    public CompleteTheRocket_A(boolean isEngineTested, boolean isCosmonauntsTested, boolean isProgramsTested, int averageRocketSpeed, String rocketDestination) {
        this.rQc.setEngineTested(isEngineTested);
        this.rQc.setCosmonauntsTested(isCosmonauntsTested);
        this.rQc.setProgramsTested(isProgramsTested);
        this.sD.setRocketAverageSpeed(averageRocketSpeed);
        this.sD.setRocketDestination(rocketDestination);
    }

    // метод який використовує в собі метои класу Б і С для того що б вивести все чітко на дисплей в залежності від результату блоку (if)
    void whereWeWillFlyNow() {
        if (rQc.rocketQC()) {
            System.out.println("Hours in fly to " + sD.getRocketDestination() + " approximately is: " + sD.rocketFlyToDestinationHours());
            System.out.println("Are you ready to start? :)");
        } else {
            System.out.println("We need to STOP the rocket! Rocket QC process has been failed!!!!");
        }
    }
}




