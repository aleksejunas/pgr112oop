package org.pgr112.ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {


    public void runProgram() {
        System.out.println("");
        System.out.println("Program starting...");
        System.out.println("");
    }

    public void task4() {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();

        System.out.println("Enter three strings: ");
        list.add(scan.nextLine());
        list.add(scan.nextLine());
        list.add(scan.nextLine());

       /* System.out.println("What you entered: ");
        System.out.println(list);*/

        System.out.println("Your loop output: ");
        for (String i : list) {
            System.out.println(i);
        }
    }
        public void task6() {
            System.out.println("Input numbers (negative numbers will  stop the sequence: )");
            Scanner integerScan = new Scanner(System.in);

            int input = integerScan.nextInt();
            int sum = 0;

            while (input >= 0) {
                sum += input;
                input = integerScan.nextInt();
            }

            System.out.println(sum);

        }

    }

