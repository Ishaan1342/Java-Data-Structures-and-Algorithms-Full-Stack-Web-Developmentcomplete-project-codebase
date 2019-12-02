package com.company.Assignment3Functions;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int deci =s.nextInt();
        System.out.println(decitooctal(deci));

    }
    public static long decitooctal(int deci){
        long oct=0;
        long place=1;
        while(deci!=0){
            int rem=deci%8;
            deci/=8;
            oct=oct+place*rem;
            place*=10;



        }
             return oct;
    }
}
