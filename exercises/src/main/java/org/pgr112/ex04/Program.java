package org.pgr112.ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {


    public void runProgram() {
        System.out.println("");
        System.out.println("Program starting...");
        System.out.println("");
    }

   /* public void task4() {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();

        System.out.println("Enter three strings: ");
        list.add(scan.nextLine());
        list.add(scan.nextLine());
        list.add(scan.nextLine());

       *//* System.out.println("What you entered: ");
        System.out.println(list);*//*

        System.out.println("Your loop output: ");
        for (String i : list) {
            System.out.println(i);
        }
    }*/

    /*public void task6() {
        System.out.println("Input numbers (negative numbers will  stop the sequence: )");
        Scanner integerScan = new Scanner(System.in);

        int input = integerScan.nextInt();
        int sum = 0;

        while (input >= 0) {
            sum += input;
            input = integerScan.nextInt();
        }

        System.out.println(sum);

    }*/

    public void task7() {
        displayMenu();

        Scanner menuInput = new Scanner(System.in);
        String input = menuInput.nextLine();

        ArrayList<String> stringsSoFar = new ArrayList<String>();

        while (!input.equals("2")) {
            if (input.equals("0")) {
                // Add new string
                System.out.println("New word to add: ");
                stringsSoFar.add(menuInput.next());
            } else if (input.equals("1")) {
                // Display all strings
                for (String s : stringsSoFar) {
                    System.out.println(s);
                }
            } else {
                System.out.println("I don't know that");
            }

            displayMenu();
            input = menuInput.next();
        }

    }

    private void displayMenu() {
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Add single word");
        menu.add("Display all words");
        menu.add("Exit");

        // The for loop gets everything from the array and displays it via menu.get(i)
        for (int i = 0; i < menu.size(); i++){
            System.out.println("" + i + " -> " + menu.get(i));
        }
    }
}

