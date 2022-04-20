package org.pgr112.ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public void task4() {

        try {
            File myFile = new File("exercises/src/main/java/org/pgr112/ex05/opg4.txt");
            Scanner fileReader = new Scanner(myFile);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured...");
            e.printStackTrace();
        }
    }

    // The String... means that zero or more String objects (or a single array of them)
// may be passed as the argument(s) for that method.
    public void task5(String... strings) {
        File myFile = new File("exercises/src/main/java/org/pgr112/ex05/opg5.txt");
        try {
            FileWriter myFW = new FileWriter(myFile);
            for (String st : strings) {
                myFW.write(st + "\n");
            }
            myFW.close();
            /*System.out.println("");
            System.out.println("Write to  file: ");
            Scanner myFileInputScanner = new Scanner(System.in);
            FileWriter myFileWriter = new FileWriter("exercises/src/main/java/org/pgr112/ex05/opg5.txt");
            myFileWriter.write(myFileInputScanner.nextLine());
            myFileWriter.close();
            System.out.println("");
            System.out.println("Succesfully wrote to the file!");*/
        } catch (IOException e) {
            System.out.println("Damn! An error  occured.....");
            e.printStackTrace();
        }


    }

    public void task7() {

    }
}
