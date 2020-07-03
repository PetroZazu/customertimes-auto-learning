package com.customertimes.lection4.homework.task9Recursion;
// спробую написати рекурсійний метод який рахуватиме суму чисел.
// числа будуть збільшуватися в арифметичній прогресії, a1 = x -> a2 = a1 + x -> a3 = a2 + x...
// маючи 3 параметри, перше число -a- , друге число -b-, і  -n- - кількість чисел які повинні бути в прогресії
// example: 5 + 20 + 35 + 50 + 65 + 80 = 255

public class SumOfArifmetPgog {
    private int dif = 0;


    //implementation 1:
    public int arifProg(int a, int b, int n) { //a = 5, b = 20, n = 6;
        dif = b - a; // присвоюємо істинну різницю між числами яку будемо додавати до суми чисел
        if (n - 2 == 0) return a + b; // (n - 2) - це тому що 2 числа вже є, якщо n - 2 == 0, значить всі чила перебрані і лишилося додати останнюпару
        return arifProg(a + dif, b + dif, n - 1) + a;
    }

    //implementation 2:
    public static int arifProgV2(int initialValue, int progressionStep, int count) {
        if (count <= 0)
            return initialValue;
        return initialValue + arifProgV2(initialValue + progressionStep, progressionStep, count - 1);
    }
}
