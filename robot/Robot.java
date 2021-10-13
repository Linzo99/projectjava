package robot;

import java.lang.Math;
import mondes.Monde;

public abstract class Robot {
    protected int posx;
    protected int posy;
    protected Monde m;

    public Robot(int x, int y, Monde m){
        this.posx = x;
        this.posy = y;
        this.m = m;
    }

    public Robot(Monde m){
        this(0, 0, m);
        int lignes = m.getNbL();
        int cols = m.getNbC();
        this.posx = (int)(Math.random() * cols);
        this.posy = (int)(Math.random() * lignes);
    }

    public void vaEn(int i, int j){
        // Se déplace en i , j
        this.posx = i;
        this.posy = j;
    }

    // Methode abstraite
    public abstract void parcourir();

}
