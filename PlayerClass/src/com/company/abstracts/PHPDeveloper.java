package com.company.abstracts;

public class PHPDeveloper extends Employees{

    @Override
    void setSalary() {
        System.out.println("Your salary is 8000 EGP");

    }

    @Override
    void workingHours() {
        System.out.println("Your working hours is 60 hour per week");

    }

    @Override
    void daysOff() {
        System.out.println("You have 4 days off per month");

    }

    @Override
    void benefits() {
        System.out.println("You got 1500 EGP as benefits");

    }
}
