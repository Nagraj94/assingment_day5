package com.bridgelabz.basic_core_program;

import com.bridgelabz.util.Utility;

import java.util.Vector;

public class PrimeFactor {

    static class Test
    {
        static final int MAX_N = 100001;


        static int[] spf = new int[MAX_N];


        static void sieve()
        {
            spf[1] = 1;
            for (int i = 2; i< MAX_N; i++)


                spf[i] = i;


            for (int i = 4; i< MAX_N; i+=2)
                spf[i] = 2;

            for (int i = 3; i*i< MAX_N; i++)
            {

                if (spf[i] == i)
                {

                    for (int j = i*i; j< MAX_N; j+=i)

                        if (spf[j]==j)
                            spf[j] = i;
                }
            }
        }


        static Vector<Integer> getFactorization(int x)
        {
            Vector<Integer> ret = new Vector<>();
            while (x != 1)
            {
                ret.add(spf[x]);
                x = x / spf[x];
            }
            return ret;
        }

        public static void main(String[] args)
        {

            sieve();
            int x;

            Utility u = new Utility();

            System.out.println("enter number to find prime factor");
            x = (int) u.inputInteger();
            System.out.print("prime factorization for " + x + " : ");

            // calling getFactorization function
            Vector<Integer> p = getFactorization(x);

            for (Integer integer : p) System.out.print(integer + " ");
            System.out.println();
        }
    }
}
