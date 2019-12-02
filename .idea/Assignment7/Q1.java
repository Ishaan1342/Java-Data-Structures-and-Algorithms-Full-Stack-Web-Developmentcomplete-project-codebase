package com.company.Assignment7;

public class Q1 {
    public static void main(String[] args) {
        System.out.println (sumstring ( 123 ));

    }
    public static int sumstring(int x){
        if( x==0){
            return 0;
        }
      return   x%10 + sumstring ( x/10 );
    }

}
