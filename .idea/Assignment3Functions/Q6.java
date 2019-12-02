package com.company.Assignment3Functions;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        long d = s.nextInt();

        digicalc(n, d);
    }

    public static void digicalc(long n, long d) {
        while (n != 0) {
            long rem = n % 10;
            if (rem%d== 0) {
                System.out.print(1);

            } else {
                System.out.print(""+"");


            }
            n/=10;
        }

    }
}