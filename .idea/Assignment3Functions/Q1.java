package com.company.Assignment3Functions;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int bin=s.nextInt();
        System.out.println(bintodeci(bin));

    }
    public static int bintodeci(int bin){
        int deci = 0;
        int place=1;
        while(bin!=0){
            int rem=bin%10;
            bin/=10;

             deci=deci+rem*place;

            place*=2;
        }
return deci;


    }

}
