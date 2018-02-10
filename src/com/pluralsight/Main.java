package com.pluralsight;

import java.util.Random;

public class Main {

    /*
https://programmingbydoing.com/
Bubble sort - Assignment #161
 */

    public static void bubble_sort( int[] arr )
        {
            for(int a=0; a < arr.length; a++){
                for(int j=1; j < (arr.length-a); j++){
                    if(arr[j-1] > arr[j]){
                        swap(arr, j);
                    }
                }
            }
        }


    public static void swap( int[] a , int j)
    {
        int temp = a[j-1];
        a[j-1] = a[j];
        a[j] = temp;
    }


    public static void main( String[] args )
    {
        Random r = new Random();
        int[] arr = new int[10];
        int i;

        // Fill up the array with random numbers
        for ( i=0; i<arr.length; i++ )
            arr[i] = 1 + r.nextInt(100);

        // Display it
        System.out.print("before: ");
        for ( i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();

        // Sort it
        bubble_sort( arr );

        // Display it again to confirm that it's sorted
        System.out.print("after : ");
        for ( i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();
    }
}
