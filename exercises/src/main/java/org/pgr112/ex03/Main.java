package org.pgr112.ex03;

import static org.pgr112.ex03.Genre.*;
public class Main  {

    public static void main(String[] args) {

        Book b = new Book("Lost in space", "Spaceman", 200, FANTASY);
        Book b2 = new Book("Sticky | The Spiderman Chronicles", "Spiderman", 400, ACTION);
        Book b3 = new Book("My poop", "Ass", 299, CRIME);
        Book b4 = new Book("Me Myself & I", "Kanye West", 200000, NARCISISM);
        Book b5 = new Book("Living with a tiny penis", "Vladimir Putin", 666, PSYCHOPATS);

        b5.setAuthor("Aleksandr Lukasjenko & Vladimir Putin");

        b.printBook();
        b2.printBook();
        b3.printBook();
        b4.printBook();
        b5.printBook();
    }
}
