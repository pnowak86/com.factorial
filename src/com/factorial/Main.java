package com.factorial;

public class Main {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact;

    }

    public static int otherfactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return otherfactorial(n - 1) * n;
        }
    }

    public static int gcd(int p, int q){
        if (p>q) {
            return gcd(p, q) = gcd(q, p%q);
        }
        else{
            return 1;
        }
    }


    public static void main(String[] args) {

        System.out.println(factorial(3));
        System.out.println(otherfactorial(5));


    }
}
