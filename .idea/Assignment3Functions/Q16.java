package com.company.Assignment3Functions;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
sqroot(n);
    }
    public static   void    sqroot(int  n){
        int c= (int) Math.sqrt(n);
        System.out.println(c);
    }
}
