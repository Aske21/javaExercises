package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the zombie apocalypse");

        //weapons
        String backpack[] = {"Shotgun", "Sniper", "Assault Rifle"};

        //zombies
        String zombies[] = {"Rusher Zombie", "Follower Zombie", "Cricket Zombie"};

        System.out.println("Your backpack contains " + Arrays.toString(backpack) +" choose your weapon by pressing 1,2 or 3");
        System.out.println("Choose wisely there are: " + Arrays.toString(zombies)+", take the appropriate weapon for each!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Now choose!!");
        int choice = scan.nextInt();

        if( choice == 1){
            System.out.println("Nice choice player, you have chosen the Shotgun!");
            System.out.println("Your choice is the " +backpack[0]);
        }else if(choice == 2){
            System.out.println("So you're one of those, good luck on the field!");
            System.out.println("Your choice is the " +backpack[1]);
        }else if(choice == 3){
            System.out.println("Kill em all!!");
            System.out.println("Your choice is the " +backpack[2]);
        }else{
            System.out.println("Choose between 1,2 and 3!");
        }

    }
}
