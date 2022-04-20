package org.pgr112.ex03;

public class Book {
    private String title;
    private String author;
    private int numberOfpages;
    private Genre genre;


    /*THIS IS THE CONSTRUCTOR*/
    public Book(String title, String author, Integer numberOfpages, Genre genre) {
        this.title = title;
        this.author = author;
        this.numberOfpages = numberOfpages;
        this.genre = genre;
    }

    public String printBook(){
        System.out.println("Title: " + getTitle() + " -" + " Author: " + getAuthor() + " - Number of pages: "
                + getNumberOfpages() + " - Genre: " + getGenre());
        return title + author;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfpages() {
        return numberOfpages;
    }

    public void setNumberOfpages(int numberOfpages) {
        this.numberOfpages = numberOfpages;
    }


    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
