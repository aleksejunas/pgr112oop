package org.pgr112.ex03;

public class Main {

    public static void main(String[] args) {

        Book b = new Book();

        b.setTitle("Lost in space");
        b.setAuthor("Spaceman");
        b.setNumberOfpages(200);

        System.out.println(b.getTitle());


    }

}
