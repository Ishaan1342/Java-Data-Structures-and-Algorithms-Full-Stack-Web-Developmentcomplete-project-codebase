package com.company.Assignment3Functions;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int n2=s.nextInt();
        modarm(n,n2);

    }

    public static void modarm(int n, int n2) {

        while (n2>n) {
            int c = 0, a, temp;

            temp = n;
            while (n > 0) {
                a = n % 10;
                n = n / 10;
                c = c + (a * a * a);
            }
            if (temp == c)
                System.out.println( n + "armstrong number");
            else

            n++;

        }
    }
}