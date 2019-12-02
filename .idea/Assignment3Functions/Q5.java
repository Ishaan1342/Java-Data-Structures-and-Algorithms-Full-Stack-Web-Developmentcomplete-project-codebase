package com.company.Assignment3Functions;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int start=s.nextInt();
        int end=s.nextInt();
        int step=s.nextInt();
        convert(start, end,step);

    }
    public static void convert(int start,int end,int step){
        while(start<=end) {


            int C = (int) ((5f/ 9) * (start - 32));
            System.out.println(C);
            start+=step;

        }
    }

}
