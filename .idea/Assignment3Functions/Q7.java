package com.company.Assignment3Functions;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();


        System.out.println(Inverse(n));

    }
    public static long Inverse(int n){
        long inv=0;
        int p=1;
        int v=0;
        while(n!=0){
            v=n%10;
            n=n/10;


            // type a += b  : type a = (type)(a + b)

            inv += p*Math.pow(10,v-1);
            p++;

        }
        return inv;

    }
}

