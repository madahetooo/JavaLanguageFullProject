package com.company.general;

import com.company.interfacees.NewInterface;
import com.company.interfacees.Printable;
import com.company.overloading.and.overriding.Ahly;

public class A4 extends Ahly implements Printable, NewInterface {

    @Override
    public void print() {
        System.out.println("This is A4 Paper");
    }

    @Override
    public void print2() {
        System.out.println("This is A4 Paper2");

    }

    @Override
    public void print3() {
        System.out.println("This is A4 Paper3");

    }

    @Override
    public void run() {

    }

    public static class subPackageClass {
    }
}
