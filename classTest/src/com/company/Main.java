package com.company;

public class Main {

    public static void main(String[] args) {
        welcome();
        multiply(2,3);
        divide(30,6);
    }

    public static void welcome(){
        System.out.println("welcome to our calculator");
    }

    public static void divide(int a, int b){
        System.out.println(a/b);
    }
    public static void multiply(int a, int b){
        System.out.println(a * b);
    }

    // string method

}
