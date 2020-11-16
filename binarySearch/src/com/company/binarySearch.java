package com.company;

public  class binarySearch{
    public static int search(int[] array, int first, int last, int searchedValue) {
        if (last >= first) {
            int mid = first + (last - first) / 2;

            if (array[mid] == searchedValue) {
                return mid;
            }
            if (array[mid] > searchedValue) {
                return search(array, first, mid - 1, searchedValue);
            } else {
                return search(array, mid + 1, last, searchedValue);
            }
        }
        return -1;
    }
}