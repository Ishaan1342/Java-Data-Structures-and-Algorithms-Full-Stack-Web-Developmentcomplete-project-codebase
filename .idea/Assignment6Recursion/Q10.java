package com.company.Assignment6Recursion;

public class Q10 {
    public static void main(String[] args) {
      int arr[]={1,2,3,4,2};
        int start=0;
        int end = arr.length-1;

        reverse(arr,start,end);

        }
        public static void reverse(int[] arr,int start, int end){
        if(start>=end){
            return;

        }
        if(start<end){
            int temp=start;
            start=end;
            end=temp;
            reverse(arr,start+1,end-1);
            System.out.println(temp);
        }
        }

    }

