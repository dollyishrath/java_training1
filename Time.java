package com.trimindtech.training.day01;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        float minutes = 197;
        float hours;
        float time;
        System.out.println("enter time");
        Scanner sc = new Scanner(System.in);
        minutes = sc.nextInt();
        hours = sc.nextInt();
        time = minutes/60;
        System.out.println(time);
       // System.out.println(minutes);
       // System.out.println(hours);
    }
}
