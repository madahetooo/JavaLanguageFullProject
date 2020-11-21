package com.company.abstracts;

public class IOSDevelopers extends Employees{


    @Override
    void setSalary() {
        System.out.println("Your salary is 9000 EGP");

    }

    @Override
    void workingHours() {
        System.out.println("Your working hours is 50 hour per week");

    }

    @Override
    void daysOff() {
        System.out.println("You have 4 days off per month");

    }

    @Override
    void benefits() {
        System.out.println("You got 3000 EGP as benefits");

    }
}
