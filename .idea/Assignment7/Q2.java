package com.company.Assignment7;

public class Q2 {
    public static void main (String[] args) {
        System.out.println (convert ( "","123" ));
    }

    public static String convert (String processed , String unprocessed) {
        if ( unprocessed.isEmpty () ) {
            return processed;

        }
        char ch = unprocessed.charAt ( 0 );
        unprocessed=unprocessed.substring ( 1 );
        return convert ( processed + ch , unprocessed );
    }
}
