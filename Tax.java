package com.trimindtech.training.day01;

import java.util.Scanner;

public class Tax {
    public static int calculateTaxForSingle(int status) {
        if (status <= 10){
            System.out.println("");
        }
        else if(status <= 15){
            System.out.println("");
        }
        else if(status <= 27){
            System.out.println("");
        }
        return status;
    }
    public static int calculateTaxForMarriedJoint(int status){
        if (status <= 10){
            System.out.println("");
        }
        else if(status <= 15){
            System.out.println("");
        }
        else if(status <= 27){
            System.out.println("");
        }
        return status;
    }
    public static int calculateTaxForMarriedSeperate(int status){
        if (status <= 10){
            System.out.println("");
        }
        else if(status <= 15){
            System.out.println("");
        }
        else if(status <= 27){
            System.out.println("");
        }
        return status;
    }
    public static int calculateTaxForHead(int status){
        if(status <= 10){
            System.out.println("");
        }
        else if(status <= 15){
            System.out.println("");
        }
        else if(status <= 27){
            System.out.println("");
        }
        return status;
    }
    public static void main(String[] args) {
        int status;
        int income;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter status");
        status = sc.nextInt();
        System.out.println("enter income");
        income = sc.nextInt();
    }
}
