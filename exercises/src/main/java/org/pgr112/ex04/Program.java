package org.pgr112.ex04;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class Program {

    public static void runProgram() {
        System.out.println("Program Running...");
    }


    public static void task4() {

        ArrayList<String> words = new ArrayList<String>();


        System.out.println("Altogether enter three strings: ");
        System.out.println("--------------------------------");
        Scanner scan = new Scanner(System.in);

        while (words.size() < 3) {
            System.out.println("Enter a string: ");
            words.add(scan.nextLine());
            System.out.println(words);
        }
    }

    public static void task6() {


        System.out.println("Enter an integer: (To stop, enter a negative number) ");
        Scanner numbers = new Scanner(System.in);

        int number = numbers.nextInt();
        int sum = 0;

        while (number >= 0) {
            sum += number;
            number = numbers.nextInt();
        }

        System.out.println(sum);

    }



    public static void task7() {

//        System.out.println("--------- MENU -------");
//        System.out.println("1: Add single word");
//        System.out.println("2: Display all words");
//        System.out.println("3: Quit");
//        System.out.println("--------------------");

        displayMenu();

        Scanner inputs = new Scanner(System.in);
        String input = inputs.next();
        ArrayList<String> stringsSoFar = new ArrayList<>();

        while (!input.equals("2"));{
            if (input.equals("0")){
                // add new string
                System.out.println("Add new word");
                stringsSoFar.add(inputs.next());
            } else if (input.equals("1")) {
                // display all strings
                System.out.println("Strings so  far: ->");
                for (String s : stringsSoFar) {
                    System.out.println(s);
                }
            }
        else }






    }




    }


