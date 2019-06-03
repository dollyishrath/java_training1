package com.trimindtech.training.day01;

import java.util.Scanner;

public class Room {
    public static void main(String[] args) {
        int length = 15;
        int width = 25;
        int area;
        System.out.println("enter area");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        width = sc.nextInt();
        area = length*width;
        System.out.println(area);

    }
}
