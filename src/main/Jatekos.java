package main;

import java.util.Random;

class Jatekos {

     final Random rnd = new Random();
    int tipp;

    void tippel() {
        tipp = rnd.nextInt(10);

        System.out.println("Tippelésem: " + tipp);

    }

}
