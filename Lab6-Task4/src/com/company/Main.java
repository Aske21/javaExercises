package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] values = {3, 2, 5, 4, 8};

        // Task 4.
        System.out.println(Arrays.toString(values));
        swap(values, 1, 0);
        System.out.println(Arrays.toString(values));
        swap(values, 0, 3);
        System.out.println(Arrays.toString(values));
    }

    /* Task 4.
    Create a method swap, to which will be passed an array and two of its indexes. The method swaps the values in the
    indexes around. The frame of the method looks like this

        public static void swap(int[] array, int index1, int index2){
            //code goes here
        }
     */
    public static void swap(int[] array, int index1, int index2){
        //code goes here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /* Task 5.
    The template you get from the test automaton has a start for an implementation of binary search. The class
    BinarySearch holds a method public static boolean search (int[] array, int searchedValue), the job of which is to
    figure out, by using binary search, if the value given as a parameter is in the sorted array that is also given as
    a parameter. The method search does not work yet, however. For testing, a seperate main prgram can be found in the
    Main class whcih has a frame like this 
     */
}
