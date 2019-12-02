package com.company.Assignment6Recursion;

public class Assignmentrestrecursion {
    public static void main(String[] args) {
        int arr[]={2,3,7,5};
        int n=arr.length;
        if(arrayQ6(arr,n)!=0){
            System.out.println("yes");

        }else{
            System.out.println("no");
        }
    }
    public static int arrayQ6(int[] arr,int n){
    if(n==0||n==1){
        return 1;

    }
    if(arr[n-1]<arr[n-2]){
        return 0;

    }
    return arrayQ6(arr,n-1);
        }
}
