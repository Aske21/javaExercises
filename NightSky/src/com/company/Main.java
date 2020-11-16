package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    NightSky sky = new NightSky(0.1, 40,10);
    sky.printLine();
    System.out.println("Number of stars: " + sky.starsInLastPrint());

    }
}
