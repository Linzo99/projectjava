package pollueurDroit;

import robotPollueur.RobotPollueur;
import mondes.Monde;

public class PollueurToutDroit extends RobotPollueur {
   private int colDepart; 

   public PollueurToutDroit(int colDepart, Monde m){
       super(colDepart, 0, m);
       this.colDepart = colDepart;
   }

    public void parcourir(){
        for(int j=0; j<this.m.getNbL(); j++){
            this.vaEn(this.colDepart, j);
            this.polluer();
        }
   }
}
