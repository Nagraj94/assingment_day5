package com.bridgelabz.basic_core_program;

import com.bridgelabz.util.Utility;

public class Harmonic {

    public static void main(String[] args) {

        // INITIALIZATION
        double result =0, num = 0, j;
        int n;
        Utility u = new Utility();

        // INPUT DATA
        System.out.print("enter the harmonic you want to find: ");
        n = (int) u.inputInteger();


        // COMPUTATION
        for (j = 1; j <= n; j++) {
            num = num + (1 / j);
            result = num;
        }
        System.out.println("the value of harmonic no. " + n + " is: " + result);

    }

}
