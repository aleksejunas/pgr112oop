package org.pgr112.lesson3;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(10, 8);
        bicycle.printStats();

        Bicycle bicycle1 = new Bicycle(5, 3);
        bicycle1.speedUp(5);

        bicycle1.changeGear(2);
        bicycle1.printStats();

        int currentGear = bicycle1.getGear();

    }
}
