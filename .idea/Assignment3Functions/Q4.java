package com.company.Assignment3Functions;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {


        Scanner s=new Scanner(System.in);
        int any=s.nextInt();
        int fbase=s.nextInt();
        int sbase=s.nextInt();

        System.out.println(anytoany(any,fbase,sbase));
    }
    public static int anytoany(int any,int fbase, int sbase){
        int deci=0;
        int place=1;
        while(any!=0) {
            int rem = any % fbase;
            any /= fbase;
            deci = deci + rem * place;
            place *= sbase;
        }
        return deci;
    }
}
