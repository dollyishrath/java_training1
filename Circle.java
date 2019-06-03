package com.trimindtech.training.day01;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        double radius;
        double area;
        double pi=22/7.0;
        System.out.println("enter radius");
        Scanner scan = new Scanner(System.in);
        radius = scan.nextFloat();
        area = pi*radius*radius;
        System.out.println(area);
    }
}
