package com.engeto;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        // create a list
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Integer userInput = Integer.parseInt(scanner.nextLine());
            if (userInput == 0) {
                break;
            }
            list.add(userInput);
        }
        int result = list.get(1) + list.get(2);
        System.out.println(result);
    }
}
