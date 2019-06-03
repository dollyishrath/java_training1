package com.trimindtech.training.day01;

import java.util.Scanner;

public class Pay {
    public static void main(String[] args) {
        int plans;
        float pay;
        Scanner sc = new Scanner(System.in);
        plans = sc.nextInt();
        switch(plans)
        {
            case 1:
                System.out.println("the company pays for all");
                break;
            case 2:
                System.out.println("4.65");
                break;
            case 3:
                System.out.println("3.78");
                break;
            case 4:
                System.out.println("3.09");
                 break;
            default:
                System.out.println("any other codes");
        }
    }
}
