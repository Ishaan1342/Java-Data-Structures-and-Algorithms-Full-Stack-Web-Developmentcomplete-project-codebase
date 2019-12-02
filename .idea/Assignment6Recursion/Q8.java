package com.company.Assignment6Recursion;

public class Q8 {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,4};

       int n=arr.length;
        System.out.println(arrayfind(arr,n,7));

    }
    public static int arrayfind(int[] arr,int n,int m){
        if(n==0){
            return -1;

        }
        if(arr[n-1]==m){

            return n;

        }
        return arrayfind(arr,n-1,m);
    }

}
