package com.customertimes.lection6.task1;

//тут ми створимо обєкт класу А
public class LaunchTest {
    public static void main(String[] args) {
        // додаю обєкт класу А, в якому я обявля поля, які в свою чергу будуть розподілені по класах Б і С.
        CompleteTheRocket_A mars = new CompleteTheRocket_A
                (false,
                true,
                true,
                333,
                "0123");


        /*Запускаю метод з класу А, який в свою чергу використає методи з класу Б і С, а методи в класах Б і С використають поля які
        ми заносимо в процесі створення обєкту класу А*/
        mars.whereWeWillFlyNow();
    }


}
