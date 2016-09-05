package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        //// for now, return a random result
        //return Math.random() > 0.5;

        //// CHECK-POINT TEN  ***************

        //int i = 0;
        //for (i = 0; i <= n; i++)
        //if (i%19 == 0 || i%31 == 0)

        if (n >= 0 && n < 2) {
            return false;
        } else if (n % 2 == 0) {
            if (n == 2) {
                return true;
            }
            return false;
        } else if (n % 2 == 1) {
            for (int i = 3; i*i <= n; i += 2) {
                return false;
            }
            return true;
        }
        return true;


    }
}