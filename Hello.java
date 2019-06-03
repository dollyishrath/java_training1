package com.trimindtech.training.day01;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        num = sc.nextInt();
        if(num % 2==0 && num % 3==0)
        {
            System.out.println("print Hello World");
        }
        else if(num % 2==0)
        {
            System.out.println("print Hello");
        }
        else if(num % 3==0)
        {
            System.out.println("print World");
        }
        else
        {
            System.out.println("print Hai");
        }
    }
}
