package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Grade checking with if loop
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grade: ");

        int grade = scan.nextInt();

        if( grade >= 90 && grade <= 100){
            System.out.println("You grade is A");
        }else if(grade >= 80 && grade <= 85){
            System.out.println("You grade is B");
        }else if ( grade >= 70 && grade <= 75){
            System.out.println("Your grade is C");
        }else if ( grade >= 60 && grade <= 65){
            System.out.println("Your grade is D");
        }else if ( grade <= 55){
        System.out.println("Your grade is F");
        }else{
            System.out.println("The number you entered is not in the range! Try the range of 70 to 100!");
        }
    }
}
