package com.engeto;

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        // create a list
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Tell me your number, I will add it to list until you write -1");
            Integer userInput = Integer.parseInt(scanner.nextLine());
            if (userInput == -1) {
                break;
            }
            list.add(userInput);
        }
        int greatest = list.get(0);

        for(int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (greatest < number) {
                greatest = number;
            }
        }
        System.out.println("Your greatest number: " + greatest);
    }
}
