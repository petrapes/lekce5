package com.engeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print "Write a message: "
        System.out.println("I will tell you a story, but I need some information first.\n" +
                "What is the main character called?");

        // Read the string written by the user, and assign it
        // to program memory "String message = (string that was given as input)"
        String name = scanner.nextLine();

        System.out.println("What is their job?");
        String job = scanner.nextLine();
        System.out.println("Here is the story: \n" +
            "Once upon a time there was " + name + ", who was " + job + ". \n" +
                "On the way to work, " + name + " reflected on life. \n" +
                "Perhaps " + name + " will not be " + job + " forever.");

    }
}
