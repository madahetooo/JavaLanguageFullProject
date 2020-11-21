package com.company.general;

public class RectangleArea {


     int  length;
     long width;
     int height;


    public  long rectangleArea1(int l, long w){
        length= l;
        width=w;
        return length*width;
    }

    public  long rectangleArea1( long l, int w){
        length= (int) l;
        width=w;
        return length*width*height;
    }





//    void RectangleArea2(){
//        RectangleArea1(2,3);
//    }


   void calculateArea(){
      System.out.println(length*width);
  }
}
