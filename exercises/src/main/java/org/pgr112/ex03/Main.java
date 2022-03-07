package org.pgr112.ex03;


import static org.pgr112.ex03.Genre.CRIME;
import static org.pgr112.ex03.Genre.FANTASY;


public class Main  {

    public static void main(String[] args) {

        Book b = new Book("Lost in space", "Spaceman", 200, FANTASY);
       /* b.setTitle("Lost in space");
        b.setAuthor("Spaceman");
        b.setNumberOfpages(200);*/

        Book b2 = new Book("Sticky - The Spiderman Chronicles", "Spiderman",  400, Genre.ACTION);
       /* b2.setTitle("Sticky - The spiderman Cronicles");
        b2.setAuthor("Spiderman");
        b2.setNumberOfpages(400);*/

        Book b3 = new Book("My poop", "Ass", 299, Genre.CRIME);

            /*System.out.println(b.getTitle());
            System.out.println(b.getAuthor());
            System.out.println(b.getNumberOfpages());*/

       b.printBook();
       b2.printBook();

        System.out.println("Title: " + b.getTitle()  + "-"   +  " Author: " + b.getAuthor() + " - Number of pages: "
                + b.getNumberOfpages() + " - Genre: " + b.getGenre() );
        System.out.println("Title: " + b2.getTitle()  + "-"   +  " Author: " + b2.getAuthor() + " - Number of pages: "
                + b2.getNumberOfpages() + "Genre: " + b2.getGenre() );
        System.out.println("Title: " + b3.getTitle()  + "-"   +  " Author: " + b3.getAuthor() + " - Number of pages: "
                + b3.getNumberOfpages() + " - Genre: " + b3.getGenre() );








    }

}
