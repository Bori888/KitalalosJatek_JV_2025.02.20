package main;

import java.util.Random;

public class Jatek {

    Jatekos j;
    int szam;//ha itt adnék értéket a start ujboli meghiváskor nem kapna uj értéket
    static final Random rnd = new Random();//illetve ha csak a számot hivom meg az mindig nulla lesz                       

    void start() {
        System.out.println("Gondoltam egy számra 0-p közöt");
        szam = rnd.nextInt(10) + 1;

        System.out.println("Kitalálano szám: " + szam);

    }

}
