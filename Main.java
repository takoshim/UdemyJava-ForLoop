package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        System.out.println("********************");
        for(int i=0; i<5; ++i) {
            System.out.println("Loop " + i + " Hello!");
        }

        System.out.println("********************");
        for(int i=2; i<=8; ++i) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i) ));
        }

        System.out.println("********************");
        for(int i=8; i>=2; --i) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i) ));
        }

        System.out.println("********************");
        int counter = 1;
        for(int i=100000; i<200000 && counter <= 3; ++i) {

            System.out.print(i + " is ");
            if (isPrime(i)) {
                System.out.print("a prime number.<----------------- #" + counter + "\n");
                ++counter;
            }
            else
                System.out.print("NOT a prime number.\n");
        }
    }

    /****************************************************
     * isPrime
     * @param n
     * @return
     ***************************************************/
    public static boolean isPrime(int n) {

        if(n==1)
            return false;

        for(int i=2; i<n; ++i) {
            if(n%i == 0)
                return false;
        }
        return true;
    }

    /****************************************************
     * calculateInterest
     * @param amount
     * @param interestRate
     * @return
     ***************************************************/
    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));
    }
}
