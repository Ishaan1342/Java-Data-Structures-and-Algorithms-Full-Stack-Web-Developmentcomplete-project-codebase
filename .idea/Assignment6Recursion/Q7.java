package com.company.Assignment6Recursion;

public class Q7 {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,4};

        if((arrayfind(arr,arr.length,2))==false) {
            System.out.println("not there ");

        }
        else{
            System.out.println("IS Present");
        }

    }
    public static boolean arrayfind(int[] arr,int n,int m){
        if(n==0){
            return false;

        }
        if(arr[n-1]==m){
                return true;

        }
      return arrayfind(arr,n-1,m);
    }


}
