package pollueurSauteur;

import robotPollueur.RobotPollueur;
import mondes.Monde;

public class PollueurSauteur extends RobotPollueur{
    private int deltax;

    public PollueurSauteur(int colDepart, int deltax, Monde m){
        super(colDepart, 0, m);
        this.deltax = deltax;
    }

    public void parcourir(){
        int dx;
        for( int i=0; i<this.m.getNbL(); i++){
            dx = this.posx;
            if( i%2 != 0 )
                dx += this.deltax;
            dx %= this.m.getNbC();
            this.vaEn(dx, i);
            this.polluer();

        }
    }

}
