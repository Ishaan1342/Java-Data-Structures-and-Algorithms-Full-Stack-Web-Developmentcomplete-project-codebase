package com.company.Assignment6Recursion;

public class Q1 {
    public static void main(String[] args) {

oddeven(6);
    }
    public static void oddeven(int n){
        if(n==0){
            System.out.println(n);
        return;
        }
        if (n%2==0){
            System.out.println(n);
            oddeven(n-1);

        }
        else{
            oddeven(n-1);
            System.out.println(n);
        }


    }
}
