package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner keyboard = new Scanner(System.in);

        String userInput;

        System.out.println("Enter an item: ");
        userInput = keyboard.next();

        while (!userInput.equals("no")) {
            System.out.println("Enter an item: ");
            userInput = keyboard.next();
            System.out.println(userInput);
            System.out.println("Do you want to add more? type no to quit.");
            userInput = keyboard.next();
        }
    }
}
