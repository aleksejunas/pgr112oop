package org.pgr112.ex05;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Program {

    public void problem4() {

        try {
            File myVeryOwnFile = new File("/home/rolf/IdeaProjects/pgr112oop/exercises/src/main/java/org/pgr112/ex05/opg4.txt");
            Scanner fileReader = new Scanner(myVeryOwnFile);
            while (fileReader.hasNextLine()) {
                String myVeryOwnData = fileReader.nextLine();
                System.out.println(myVeryOwnData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void task5() {

        Scanner myVeryOwnScanner = new Scanner(System.in);

    }

//    public void problem7() {
//
//        File fileWithArtists = new File("/home/rolf/IdeaProjects/pgr112oop/exercises/src/main/java/org/pgr112/ex05/opg7.txt");
//        ArrayList<String> artistsList = readArtists(fileWithArtists);
//        for (Artist a : artistsList) {
//            a.printArtistData();
//        }
//
//    }

}
//    public void task5(String... strings) {
//        File myFile = new File("exercises/src/main/java/org/pgr112/ex05/opg5.txt");
//        try {
//            FileWriter myFW = new FileWriter(myFile);
//            for (String st : strings) {
//                myFW.write(st + "\n");
//            }
//            myFW.close();

         /*System.out.println("");
           System.out.println("Write to  file: ");
          Scanner myFileInputScanner = new Scanner(System.in);
           FileWriter myFileWriter = new FileWriter("exercises/src/main/java/org/pgr112/ex05/opg5.txt");
           myFileWriter.write(myFileInputScanner.nextLine());
           myFileWriter.close();
           System.out.println("");
           System.out.println("Succesfully wrote to the file!");*/


//        try {
//            File myFile = new File("exercises/src/main/java/org/pgr112/ex05/opg4.txt");
//            Scanner fileReader = new Scanner(myFile);
//            while (fileReader.hasNextLine()) {
//                String data = fileReader.nextLine();
//                System.out.println(data);
//            }
//            fileReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occured...");
//            e.printStackTrace();
//        }
//    }
//
//    // The String... means that zero or more String objects (or a single array of them)
//// may be passed as the argument(s) for that method.
//    public void task5(String... strings) {
//        File myFile = new File("exercises/src/main/java/org/pgr112/ex05/opg5.txt");
//        try {
//            FileWriter myFW = new FileWriter(myFile);
//            for (String st : strings) {
//                myFW.write(st + "\n");
//            }
//            myFW.close();
            /*System.out.println("");
            System.out.println("Write to  file: ");
            Scanner myFileInputScanner = new Scanner(System.in);
            FileWriter myFileWriter = new FileWriter("exercises/src/main/java/org/pgr112/ex05/opg5.txt");
            myFileWriter.write(myFileInputScanner.nextLine());
            myFileWriter.close();
            System.out.println("");
            System.out.println("Succesfully wrote to the file!");*/
//        } catch (IOException e) {
//            System.out.println("Damn! An error  occured.....");
//            e.printStackTrace();
//        }




