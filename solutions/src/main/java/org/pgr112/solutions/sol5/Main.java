package org.pgr112.solutions.sol5;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        Program pr = new Program();

        //Task 4:
        pr.task4();

        //Task 5:
        pr.task5("one", "to", "tre", "fyre", "cinq");

        //Task 7
        pr.task7();

        //Task 8
        pr.task8();

        // I only need to run this once, so here it is. :)
        pr.createExtraFile();

        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);

        hs.add(5);
        hs.add(5);
        hs.add(5);

        hs.size();

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(100, "HaHa");
        hm.put(100000, "Hi Hi");
        hm.put(101, "HaHa");
        hm.put(100000, "Ho Ho");

        hm.size();

    }
}
