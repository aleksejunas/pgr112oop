package org.pgr112.ex03;

public class Book {
    private String title;
    private String author;
    private int numberOfpages = 1;
    private Genre genre;

    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        if(pages > 0) {
            this.numberOfpages = pages;
        }
    }

    public Book(String title, String author, Integer numberOfpages, Genre genre) {
        this.title = title;
        this.author = author;
        this.numberOfpages = numberOfpages;
        this.genre = genre;
    }

    public String printBook(){
        return title + " - " + author;

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
