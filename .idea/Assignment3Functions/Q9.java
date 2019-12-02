package com.company.Assignment3Functions;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        arm(n);
    }

    public static void arm(int n){

        int c = 0, a, temp;

        temp = n;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }
        if (temp == c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}




