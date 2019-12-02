package com.company.Assignment3Functions;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

         lcm(a,b);

    }
    public static void lcm(int a, int b){
        int max,step,lcmo=0;

        if (a>b) {
            max=step=a;
        }else{
                step=max=b;

            }
        while(a!=0){
            if(max%a==0 && max%b==0){
                lcmo=max;
            break;
            }
            max+=step;
            }
        System.out.println("lcm is "+ lcmo);
        }

}
