package org.pgr112.ex05;

import java.time.LocalDate;

public class Artist {

    private String artistName;
    private LocalDate dateOfBirth;
    private String city;
    private String  country;
    private int Id;

    public Artist(String artistName, LocalDate dateOfBirth, String city, String country) {
        this.artistName = artistName;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.country = country;
    }

    public String getArtistName() { return artistName; }

    public void setArtistName(String artistName) { this.artistName = artistName; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }

    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    public int getId() { return Id; }

    public void setId(int id) { Id = id; }

    public String displayData() {
        return "Name: " +  this.artistName + ";\t " +
                "Date Of Birth: " + this.dateOfBirth + ";\t " +
                "City: " + this.city + ";\t " +
                "Country: " + this.country + ";\t ";
    }

    public void printData() { System.out.println(displayData()); }

}
