package robotNettoyeurDistrait;

import robot.Robot;
import mondes.Monde;

public class NettoyeurDistrait extends Robot {

    public NettoyeurDistrait(Monde m){
        super(0, 0, m);
    }

    public void nettoyer(){
        this.m.prendPapierGras(this.posy, this.posx);
    }

    public void parcourir(){
        int count = 0;
        for(int i=0; i<this.m.getNbL(); i++)
            if( i%2 == 0 )
                for(int j=0; j<this.m.getNbC(); j++){
                    this.vaEn(j, i);
                    if(this.m.estSale(i, j)){
                        count++;
                        if( count%2 == 1 ) this.m.prendPapierGras(this.posy, this.posx);
                    }
                
                }
            else
                for(int j=this.m.getNbC()-1; j>=0; j--){
                    this.vaEn(j, i);
                    if(this.m.estSale(i, j)){
                        count++;
                        if( count%2 == 1 ) this.m.prendPapierGras(this.posy, this.posx);
                    }
                }
    }
    
}
