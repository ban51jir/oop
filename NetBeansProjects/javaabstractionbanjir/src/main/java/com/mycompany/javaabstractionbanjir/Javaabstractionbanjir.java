/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaabstractionbanjir;

/**
 *
 * @author Student1
 */
abstract class ShapeArea {
    abstract void Area();
    
}
class Triangle extends ShapeArea{
    void Area ()
    {
        double x=3.0f;
        double y=4.0f;
        double area=0.5*x*y;
        System.out.println( "Area of the Triangle:"+ area);
    }
}
class Rectangle extends ShapeArea{
    void Area(){
        int x=3;
        int y=4;
        int area =x*y;
        System.out.println("area of the Rectangle"+area);
        
}
}
public class Javaabstractionbanjir {

    public static void main(String[] args) {
        Triangle A =new Triangle();
        A.Area();
        Rectangle B=new Rectangle();
        B.Area();
    }
}
