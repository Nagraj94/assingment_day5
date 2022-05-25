package com.bridgelabz.basic_core_program;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {

        Scanner flip_coin = new Scanner(System.in);
        System.out.println("how many time you want to flip the coin");

        double numTimes = flip_coin.nextDouble();

        double result;
        double heads = 0;

        while (numTimes <= 1000)
        {
            result = Math.random();
            if(result <= .5)
             heads++;
            numTimes = numTimes + 1;
        }
        double percentHeads = heads/numTimes*100;
        double percentTails = (numTimes-heads)/numTimes*100;
        System.out.println("percentage of heads is: " +percentHeads);
        System.out.println("percentage of tails is: " +percentTails);

    }
}
