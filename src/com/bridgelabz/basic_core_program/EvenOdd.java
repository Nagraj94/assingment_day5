package com.bridgelabz.basic_core_program;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("enter number to check even or odd ");
        int x = num.nextInt();

        if ( x % 2 == 0 )
        {
            System.out.println("you have entered even number ");
        }
        else
        {
            System.out.println("you have entered odd number ");
        }


    }
}
