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

    private ArrayList<Artist> readArtists(File artistFile) {
    }

    public void task8() {

        File sourceFile = new File("exercises/src/main/java/org/pgr112/ex05/opg7.txt");
        File destFile = new File("exercises/src/main/java/org/pgr112/ex05/opg8.txt");
        ArrayList<Artist> artists = readArtists(sourceFile);

        for (Artist:
             artists) {
            if (ar.getCountry().equalsIgnoreCase("Norge")) {
                ar.setCountry("Norway");
            }

            writeArtistsWithId(ArrayList < Artist > artistList, File file) {
                try {
                    FileWriter fw = new FileWriter(file);
                    for (artist ar : artistsList) {
                        fw.write(ar.getArtistName() + "\n");
                        fw.write(ar.getDateOfBirth() + "\n");
                        fw.write(ar.getCity() + "\n");
                        fw.write(ar.getCountry() + "\n");
                        fw.write(ar.getId() + "\n");
                    }
                    fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            public void writeArtists (ArrayList < Artist > artistsList, File file){
                try {
                    FileWriter fw = new FileWriter(file);
                    for (Artist ar : artistsList) {
                        fw.write(ar.getArtistName());
                        fw.write(ar.getDateOfBirth());
                        fw.write(ar.getCity());
                        fw.write(ar.getCountry());
                        fw.write("---\n");
                    }
                    fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            public ArrayList<Artist> readArtistsWithId (File file){
                ArrayList<Artist> artists = new ArrayList<>();
                try {
                    Scanner input = new Scanner(file);
                    while (input.hasNextLine()) {
                        // Read the details of each artist
                        String name = input.nextLine();
                        String date = input.nextLine();
                        LocalDate dob = LocalDate.parse(date);
                        String city = input.nextLine();
                        String country = input.nextLine();

                        Artist aux = new Artist(name, dob, city, country);
                        artists.add(aux);

                    }
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                return artists;
            }

            // To not create the extra.txt file by hand, we will automate it
            public void createExtraFile () {
                File sourceFile = new File("exercises/src/main/java/org/pgr112/ex05/opg7.txt");
                File destFile = new File("exercises/src/main/java/org/pgr112/ex05/extra.txt");
                ArrayList<Artist> artists = readArtists(sourceFile);

                // Let's add Bruce from  Iron Maiden
                Artist a = new Artist(
                        "Bruce Dickinson",
                        LocalDate.parse("1958-08-07"),
                        "Worksop",
                        "UK"
                );
                artists.add(a);

                // We will use this index to give each artist a uniqe ID
                int index = 0;

                for (Artist ar : artists) {
                    ar.setId(index);
                    index++;
                }

                writeArtistsWithId(artists, destFile);

            }

            public ArrayList<Artist> getArtists () {
                return artists;
            }

            public void printMenu () {
                System.out.println("=== Menu ===");
                System.out.println(" 1 -> Display All  Artists ");
                System.out.println(" 2 -> Get artist based on ID ");
                System.out.println(" 3 -> Add Artist ");
                System.out.println(" 4 -> Change Artist based on ID ");
                System.out.println(" 5 -> Exit ");
            }

            public Artist getFromId ( int id){
                for (Artist ar : artists) {
                    if (ar.getId() == id) {
                        return ar;
                    }
                }

                return null;
            }

            public void addArtist (String name, LocalDate dob, String city, String country){
                Artist aux = new Artist(name, dob, city, country);
                aux.setId(artists.size() + 1);
                artists.add(aux);
            }

            public static void main (String[]args) .øæ å´+{
                    // Extra main  method to seperate the extra task
                    File artistFile = new File("exercises/src/main/java/org/pgr112/ex05/extra.txt");
            Program pr = new Program(artistFile);

            Scanner userInput = new Scanner(System.in);

            System.out.println("Welcome to my interpretation (no pun intended) of the extra task!");

            // pr.printmenu();
            String choice = "0";

            while (!choice.equalsIgnoreCase("5")) {
                switch (choice) {
                    case "0": {
                        pr.printMenu();
                        break;
                    }
                    case "1": {
                        System.out.println("Display all");
                        for (Artist ar : pr.getArtists()) {
                            ar.printData();
                        }
                        break;
                    }
                    case "2": {
                        System.out.println("Get from ID: ");
                        try {
                            int id = userInput.nextInt();
                            // This is needed to consume the \n, which nextInt does not consume
                            userInput.nextLine();

                            Artist a = pr.getFromId(id);
                            if (a != null) {
                                a.printData();
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("What exactly are you doing???");
                            ex.printStackTrace();
                        }
                        break;
                    }
                    case "3": {
                        System.out.println("Add artist");

                        Artist a = pr.createArtist(userInput);
                        pr.addArtist(a);

                        System.out.println("Added!");
                        pr.printMenu();
                        break;
                    }
                    case "4": {
                        System.out.println("Modify artist. Choose ID: ");

                        try {
                            int id = userInput.nextInt();
                            // This is needed to consume the \n, which nextInt does not consume
                            userInput.nextLine();

                            Artist a = pr.getFromId(id);
                            Artist mod = pr.createArtist(userInput);

                            a.setArtistName(mod.getArtistName());
                            a.setDateOfBirth(mod.getDateOfBirth());
                            a.setCity(mod.getCity());
                            a.setCountry(mod.getCountry());

                            a.printData();
                        } catch (InputMismatchException ex) {
                            ex.printStackTrace();
                            System.out.println("Troubling, that. ");
                        }
                        break;
                    }
                    default: {
                        System.out.println("I'm afraid I can't do that, Dave.");
                        pr.printMenu();
                        break;
                    }
                }
                System.out.println("Press 0 for menu.");
                choice = userInput.nextLine();
            }
            System.out.println("Saving");
            File dest = new File("exercises/src/main/java/org/pgr112/ex05/extra.txt");
            pr.writeArtistsWithId(pr.artists, dest);
            System.out.println("Exiting now!");

                }

            public Artist createArtist (Scanner userInput){
                System.out.println("Name: ");
                String name = userInput.nextLine();

                System.out.println("Date of Birth: ");
                String dob = userInput.nextLine();
                LocalDate date = LocalDate.now();
                try {
                    date = LocalDate.parse(dob);
                } catch (DateTimeException ex) {
                    System.out.println("What exactly are you doing???");
                    ex.printStackTrace();
                    System.out.println("I'll just default to now!");
                }
                System.out.println("City: ");
                String city = userInput.nextLine();

                System.out.println("Country: ");
                String country = userInput.nextLine();

                Artist result = new Artist(name, date, city, country);
                return result;
            }

        }
    }
}


