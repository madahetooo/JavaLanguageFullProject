package com.company.abstracts;

import com.company.interfacees.Contract;
import com.company.interfacees.ContractNumber2;

public class AndroidDeveloper extends Employees implements Contract, ContractNumber2 {


      int salary = 20000;


    @Override
    void setSalary() {
        System.out.println("Your salary is 20000 EGP");
    }

    @Override
    void workingHours() {
        System.out.println("Your working hours  is 40 hour per week ");

    }

    @Override
    void daysOff() {
        System.out.println("You have 8 days off per month ");
    }

    @Override
    void benefits() {
        System.out.println("you got 2000 EGP");
    }


    @Override
    public void bandOne() {
        System.out.println("You have to come at 8:00 AM");
    }

    @Override
    public void bandTwo() {
        System.out.println("YOu have to leave at 4 : 00 PM");
    }

    @Override
    public void bandThree() {
        System.out.println("You have 1 hour break");
    }

    @Override
    public void bandFour() {
        System.out.println("YOu have to use your own cup ");
    }
}
