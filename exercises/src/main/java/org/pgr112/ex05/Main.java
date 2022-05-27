package org.pgr112.ex05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {

        // An object of the Program class. That is used so you can call methods
        // from the other classes
    Program prg = new Program();
    Artist artist = new Artist("The Red Hot Chili Peppers", LocalDateTime.of(1980, 12, 6, 6, 6), "Los Angeles", "U.S.A" );

    prg.problem4();
    // prg.task5("Those", "Honky Tonkers", "are", "completely utter", "Bonkers" );
   // prg.task5();
    // artist.printArtistFromFields();
    }

}
