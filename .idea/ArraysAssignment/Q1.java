package com.company.ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ar[]= new int[5];
        for(int i=0;i<ar.length;i++){
            ar[i]=s.nextInt();

        }
        System.out.println(Arrays.toString(ar));
        System.out.println(max(ar,0,ar.length));

    }
    public static int max(int ar[],int start,int end){
        int max=start;
        for( int i=1;i<end;i++){
            if(ar[max]<ar[i]){
                max=i;


            }

        }
        return max;
    }
}
