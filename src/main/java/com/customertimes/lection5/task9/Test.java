package com.customertimes.lection5.task9;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("Почтальон Печкін", 2);
        Employee e2 = new Employee("Дядя Начальнік", 55);
        Employee e3 = new Employee("Пацани я джун!!!", 0.2);
        System.out.println("sum of all employees salaries is: " + Employee.salarySum);
    }
}
