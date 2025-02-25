package main;

import java.util.Random;

 class Jatek {

    private Jatekos j1, j2, j3;//mivel privalt és nem statik ehet rá this el hivatkozni
    private int szam;//ha itt adnék értéket a start ujboli meghiváskor nem kapna uj értéket
    private static final Random RND = new Random();//illetve ha csak a számot hivom meg az mindig nulla lesz      
    public static int MAX;
    public static int MIN;

    public Jatek(){//ez egy konstruktor ami inicalizálja az összes this-t
        this.j1 = new Jatekos();
        this.j2 = new Jatekos();
        this.j3 = new Jatekos();
        this.szam = Jatek.RND.nextInt(Jatek.MIN,Jatek.MAX);
    }
    public void start() {
        System.out.println("Gondoltam egy számra 0-p közöt");
        MAX = 15;
        MIN = 1;
        

        System.out.println("Kitalálano szám: " + this.szam);
        
        
        int tipp1,tipp2,tipp3;
        boolean vanNyertes;
        do {
            this.j1.tippel();
            this.j2.tippel();
            this.j3.tippel();

            tipp1 = this.j1.getTipp();
            tipp2 = this.j2.getTipp();
            tipp3 = this.j3.getTipp();

            System.out.println("1.jatékos tippje: " + tipp1);
            System.out.println("2.jatékos tippje: " + tipp2);
            System.out.println("3.jatékos tippje: " + tipp3);

            vanNyertes = this.szam == tipp1 || this.szam == tipp2 || this.szam == tipp3;
            if (!vanNyertes) {
                System.out.println("A játékosok ujraprobálkoznak");
                System.out.println("Kitalálano szám: " + this.szam);
            }  
        } while (!vanNyertes);
        System.out.println("van nyertes");

    }

}
