package com.bridgelabz.basic_core_program;

import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args) {

        Scanner year = new Scanner(System.in);
        System.out.println("enter year to know leap year ");

        double results = year.nextDouble();

        if(results % 4 == 0 ){
            System.out.println("you have entered leap year ");
        }
        else {
            System.out.println("you have not entered leap year ");
        }
    }
}
