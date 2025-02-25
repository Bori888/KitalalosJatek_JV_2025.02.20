package main;

import java.util.Random;

class Jatekos {

    static final Random RND = new Random();
    private int tipp;
    
    
    Jatekos (){
        this.tipp = Jatek.MAX;
        this.tipp = Jatek.MIN;
    }
            
    public int getTipp(){
        return tipp;
    }

    public void tippel() {
        this.tipp = Jatekos.RND.nextInt(Jatek.MAX);//MAX final mert nagybetus, és statik mert egy osztályon kersztul elérheto Jatek.MAX

        System.out.println("Tippelésem: " + tipp);

    }

}
