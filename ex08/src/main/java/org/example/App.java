package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "How many people?" );
        int ppl = scan.nextInt();

        System.out.println( "How many pizzas?" );
        int zas = scan.nextInt();

        System.out.println( "How many slices per pizza?" );
        int slices = scan.nextInt();

        System.out.println( ppl + " people with " + zas + "pizzas (" + (zas*slices) +")");
        System.out.println( "Each person gets "+(zas*slices/ppl)+" slices");
        System.out.println( "There are "+(zas*slices%ppl)+" leftover slices");
    }
}
