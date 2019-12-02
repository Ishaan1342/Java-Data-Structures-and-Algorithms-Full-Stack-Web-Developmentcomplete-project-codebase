package com.company.Assignment3Functions;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int oct=s.nextInt();
        System.out.println(octtodeci(oct));

    }
    public static int octtodeci(int oct){
        int deci=0;
        int place=1;
        while(oct!=0) {
            int rem = oct % 10;
            oct /= 10;
            deci = deci + rem * place;
            place *= 8;
        }
        return deci;
    }
}
