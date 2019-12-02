package com.company.Assignment3Functions;
//GCD of a number
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        gcd(num1, num2);
    }
    public static void gcd(int num1,int num2){


        while (num1 != num2) {
            if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }

        System.out.printf("GCD of given numbers is: %d ", num1);
    }
    }




