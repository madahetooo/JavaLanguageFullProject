package com.company.general;

public class Student {

    int id;
    String name;
    static  String college="Cairo University";

    Student(int i,String n){
       id=i;
       name=n;
    }

    static  void changeUniversity(){
        college="MUST university";
    }

    void displayValues(){
        System.out.println("This is id : " +id +" This is your name "+name +" Your College is "+college);
    }

}
