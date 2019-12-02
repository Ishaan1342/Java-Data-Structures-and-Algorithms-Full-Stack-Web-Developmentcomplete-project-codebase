package com.company.Assignment3Functions;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner s=  new Scanner((System.in));
        int n   =s.nextInt();
        int x   =s.nextInt();
log(n,x);
    }
    public static void log(int n,int   x){
        int c= (int) (Math.log(x)/Math.log(n));
        System.out.println(c);



    }
}
