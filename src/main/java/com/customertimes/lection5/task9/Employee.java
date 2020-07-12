package com.customertimes.lection5.task9;
// The static modifier determines the class variable as one that will be applied universally to all instances of a particular class
// Static methods can be accessed without class object creation. for example classname.methodname(param list);
// usually we can use example with increases number every time when class object created, in my example I will summary employees salary

public class Employee {
    private String name;
    private double experienceYears;
    private int salary;
    static int salarySum;

    public Employee(String employeeName, double experienceYears) {
        this.name = employeeName;
        this.experienceYears = experienceYears;
        sumSalary();
        System.out.println(this.name + " Salary is: " + this.salary);

    }

    public void sumSalary() {
        if (this.experienceYears < 1) {
            this.salary = 666;
        }
        if (this.experienceYears >= 1 && this.experienceYears < 3) {
            this.salary = 900;
        }

        if (this.experienceYears >= 3 && this.experienceYears < 100) {
            this.salary = 2500;
        }
        salarySum = salary + salarySum;
    }

    public double getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(double experienceYears) {
        this.experienceYears = experienceYears;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
