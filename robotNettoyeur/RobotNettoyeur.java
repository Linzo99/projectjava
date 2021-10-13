package robotNettoyeur;

import robot.Robot;
import mondes.Monde;


public class RobotNettoyeur extends Robot {
    
    public RobotNettoyeur(Monde m){
        super(0, 0, m);
    }

    public void nettoyer(){
        this.m.prendPapierGras(this.posy, this.posx);
    }

    public void parcourir(){
        for(int i=0; i<this.m.getNbL(); i++)
            if( i%2 == 0 )
                for(int j=0; j<this.m.getNbC(); j++){
                    this.vaEn(j, i);
                    if(this.m.estSale(i, j)) this.nettoyer();
                }
            else
                for(int j=this.m.getNbC()-1; j>=0; j--){
                    this.vaEn(j, i);
                    if(this.m.estSale(i, j)) this.nettoyer();
                }
    }
    
}
