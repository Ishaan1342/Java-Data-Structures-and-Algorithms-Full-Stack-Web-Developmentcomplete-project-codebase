package com.company.ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int ar[]=new int[5];
for (int i=0;i<ar.length;i++){
    ar[i]=s.nextInt();

}
        System.out.println(Arrays.toString(ar));
search(ar,5);
    }
    public static void search(int ar[],int element){
        for(int i=0;i<ar.length;i++){
            if(element==ar[i]){
                System.out.println(i);
            }
        }
    }

}
