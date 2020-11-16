package com.company;
import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int [] arrayN = {-3, 2, 3, 4 , 7, 8, 12};
        Scanner reader = new Scanner(System.in);

        System.out.println("Values of this array are: " + Arrays.toString(arrayN));
        System.out.println();
        System.out.println("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        int result = binarySearch.search(arrayN, 0, arrayN.length, Integer.parseInt(searchedValue));

        if (result == -1 ) {
            System.out.println("Value: " + searchedValue + " is not in the array");
        }else{
            System.out.println("Value: " + searchedValue + " is in the array");
        }

    }

    }


