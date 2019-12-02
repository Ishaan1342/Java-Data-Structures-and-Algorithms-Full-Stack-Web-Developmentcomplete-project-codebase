package com.company.Assignment6Recursion;

public class Q4 {
    public static void main(String[] args) {
triangle(7,1,0);

    }
    public static void triangle(int n,int i,int p){
        if(n==0){
            return;

        }
        if(n>0){
            p=p+1;
            System.out.println(i+" triangle is "+p);
            triangle(n-1,i+1,p);
        }
    }

}
