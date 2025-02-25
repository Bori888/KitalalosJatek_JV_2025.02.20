package main;

import java.util.Random;

public class Jatek {

    Jatekos j1, j2, j3;
    int szam;//ha itt adnék értéket a start ujboli meghiváskor nem kapna uj értéket
    static final Random rnd = new Random();//illetve ha csak a számot hivom meg az mindig nulla lesz                       

    void start() {
        System.out.println("Gondoltam egy számra 0-p közöt");
        szam = rnd.nextInt(10);

        System.out.println("Kitalálano szám: " + szam);
        j1 = new Jatekos();
        j2 = new Jatekos();
        j3 = new Jatekos();
        
        boolean vanNyertes;
        do {
            j1.tippel();
            j2.tippel();
            j3.tippel();

            int tipp1 = j1.tipp;
            int tipp2 = j2.tipp;
            int tipp3 = j3.tipp;

            System.out.println("1.jatékos tippje: " + tipp1);
            System.out.println("2.jatékos tippje: " + tipp2);
            System.out.println("3.jatékos tippje: " + tipp3);

            vanNyertes = szam == tipp1 || szam == tipp2 || szam == tipp3;
            System.out.println("A játékosok ujraprobálkoznak");
        } while (!vanNyertes);
        System.out.println("van nyertes");

    }

}
