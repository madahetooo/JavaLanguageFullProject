package com.company.encabsulation;

import java.util.Scanner;

public class BankingSystem {


    int accountNumber;
    String customerName;
    float currentAmount;
    float money;

    public void setCustomerDetails(){
        System.out.println("Please enter your account number");
        Scanner scanner=new Scanner(System.in);
        accountNumber=scanner.nextInt();

        System.out.println("Please enter your name");
        Scanner scanner1=new Scanner(System.in);
        customerName=scanner1.nextLine();

        System.out.println("please enter your current amount of money");
        currentAmount=scanner.nextFloat();

    }
    public void getCustomerDetails(){
        System.out.println("Your account number is : " + accountNumber);
        System.out.println("Your Name is : " + customerName);
        System.out.println("Your current amount of money  is : " + currentAmount);

    }

    public void deposit(){
        System.out.println("Please enter your deposit amount");
        Scanner scanner = new Scanner(System.in);
        money=scanner.nextFloat();
        currentAmount = currentAmount + money;
        System.out.println(money + "is deposited");

    }

    public void withdraw(){
        System.out.println("Please enter your withdraw amount");
        Scanner scanner = new Scanner(System.in);
        money=scanner.nextFloat();
        if (money>currentAmount){
            System.out.println("you do not have enough money");
        }
        else
        {
            currentAmount = currentAmount - money;
            System.out.println(money + "is withdraw");
        }


    }
    public void checkBalance(){

        System.out.println("YOUR BALANCE IS : " + currentAmount);
    }


}
