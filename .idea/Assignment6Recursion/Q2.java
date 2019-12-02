package com.company.Assignment6Recursion;

public class Q2 {
    public static void main(String[] args) {
        pattern(0, 5);


    }

    public static void pattern(int i, int j) {

        if (j == 0) {
            return;
        }
        if (i > j) {

            System.out.println();
            pattern(0, j - 1);
return;

        }
        if (i <= j) {
            System.out.print("*");
            pattern(i + 1, j);

        }
    }
}

