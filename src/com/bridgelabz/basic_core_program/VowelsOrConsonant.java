package com.bridgelabz.basic_core_program;

import java.util.Scanner;

public class VowelsOrConsonant {

    public static void main(String[] args) {

        System.out.println("enter alphabets");

         Scanner alphabets = new Scanner(System.in);
           char y = alphabets.next().charAt(0);


        if(y == 'a' || y == 'A' || y == 'e' || y =='E' || y == 'i' ||y == 'I' || y == 'o' || y == 'O'
                 || y == 'u' || y == 'U')
         {
             System.out.println("you have entered vowels");
         }
         else
         {
             System.out.println("you have entered consonant");
         }
    }
}
