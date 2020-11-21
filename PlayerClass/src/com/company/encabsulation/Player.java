package com.company.encabsulation;

import java.util.Scanner;

public class Player {


       String playerName;  //null
       String playerClub;  //null
       String playerNationality; //null


    private double shootPower; //0.0
      private double passPower;//0.0
      private int   numberOfGoals;   // 0



        Player(){

         System.out.println("This is Constructor");

    }
        Player(int numberOfGoals){
         this.numberOfGoals=numberOfGoals;


    }
        Player(int shootPower ,  int passPower){

                  this.shootPower = shootPower;
                  this.passPower=passPower;
        }
        Player(int shootPower, int passPower, int numberOfGoals){
            this.shootPower = shootPower;
            this.passPower=passPower;
            this.numberOfGoals=numberOfGoals;

        }

   public double abuTrika(double shootPower, double passPower){
        this.shootPower = shootPower;
        this.passPower=passPower;
        return 0;
    }
    public int abuTrika(int shootPower, int passPower){
        this.shootPower = shootPower;
        this.passPower=passPower;
        return 0;

    }



    public void setPlayerInformation(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name");
        playerName = scanner.nextLine();

        System.out.println("please enter your club");
        playerClub = scanner.nextLine();

        System.out.println("please enter your Nationality");
        playerNationality = scanner.nextLine();

        System.out.println("Please enter your power of shoot");
        shootPower = scanner.nextFloat();

        System.out.println("Please enter your Pass of shoot");
        passPower = scanner.nextFloat();

        System.out.println("Please enter your Number of goals");
        numberOfGoals = scanner.nextInt();

    }

    public void getPlayerInformation(){

        System.out.println("Your name is "+ playerName);
        System.out.println("Your club is "+ playerClub);
        System.out.println("Your Nationality is "+ playerNationality);
        System.out.println("Your shoot power is "+ shootPower);
        System.out.println("Your pass power is "+ passPower);
        System.out.println("Your number of goals  is "+ numberOfGoals);
        this.setPlayerInformation();
    }

    public int skillAverage(){
        return (int) ((shootPower + passPower + numberOfGoals)/3);
    }


}
