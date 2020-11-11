package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // set an array value we are going to pass through to the method smallest
        int [] values = {6, 5 , 7, 11};
        // output of the method smallest()
        System.out.println("The smallest value is " + smallest(values));
        // output of the method indexOfTheSmallest()
        System.out.println("The index of the smallest value is " + indexOfTheSmallest(values));
        // output of the method indexOfTheSmallestStartingFromm
        System.out.println("The smallest value is at the index " + indexOfTheSmallestStartingFrom(values, 0));
    }

    /* Implement a method smallest, which returns the smallest value in the array. The frame of the method is as follows: */
    public static int smallest(int[] array){
        //code here
        int smallest = array [0];
        for (int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return  smallest;
    }

    /* Implement a method indexOfTheSmallest, which returns the index of the smallest value in the array (the position
    of the value in the array that is).
     */
    public static int indexOfTheSmallest( int [] array){
        // code here
        int smallest = array [0];
        int index = 1;
        for (int i = 1; i < array.length; i++){
            if (array[i] < smallest){
                index = i;
                smallest = array[i];
            }
        }
     return index;
    }

    public static int indexOfTheSmallestStartingFrom (int[] array, int index){
        int smallest = array [index];
        int indexOfTheSmallest = index;

        for (int i = index+1; i < array.length; i++){
            if (array[i] < smallest){
                indexOfTheSmallest = i;
                smallest = array[i];

            }

        }
        return indexOfTheSmallest;
    }
}
