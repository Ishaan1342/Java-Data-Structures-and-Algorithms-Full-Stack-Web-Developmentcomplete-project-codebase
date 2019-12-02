package com.company.Assignment3Functions;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();

        random(x,n);

    }
    public static int random(int x, int n){
        int c=0;
         c= (int) Math.pow(x,n);
        System.out.println(c);
return c;
    }
}
