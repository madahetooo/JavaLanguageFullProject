package com.company.general;

public class TestArray {

    static void minimum(int arrayValues[]){

        int minimum=arrayValues[0];

        for(int i=1;i<arrayValues.length;i++)
            if(minimum>arrayValues[i])
                minimum=arrayValues[i];

        System.out.println(minimum);


    }
}
