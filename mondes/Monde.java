package mondes;

import javax.lang.model.util.ElementScanner6;

public class Monde{
    private int nbL;
    private int nbC;
    protected boolean mat[][];

    public Monde(){
        this.nbL = 10;
        this.nbC = 10;
        for(int i=0; i<this.nbL; i++)
            for(int j=0; j<this.nbC; j++)
                mat[i][j] = false;
    }

    public Monde(int ligne, int col){
        this.nbL = ligne;
        this.nbC = col;
        for(int i=0; i<this.nbL; i++)
            for(int j=0; j<this.nbC; j++)
                mat[i][j] = false;

    }

    public String toString(){
        String chaine="";
        for(int i=0; i<this.nbL; i++)
            for(int j=0; j<this.nbC; j++)
                if( this.mat[i][j] )
                    chaine += 'o';
                else
                    chaine += '.';
            chaine += '\n';

        return chaine;
            
    }

    public void metPapierGras(int i, int j){
        // Met un papier gras à une position
        this.mat[i][j] = true;
    }

    public void prendPapierGras(int i, int j){
        // Enleve un papier gras à une position
        this.mat[i][j] = false;
    }

    public boolean estSale(int i, int j){
        // Verifie si une case est salle
        return this.mat[i][j];
    }

    public int nbPapiersGras(){
        // Retourne le nombre de papier gras dans le monde
        int count = 0;
        for(int i=0; i<this.nbL; i++)
            for(int j=0; j<this.nbC; j++)
                if(this.mat[i][j])
                    count++;
        
        return count;
    }

    public int getNbL(){
        return this.nbL;
    }

    public int getNbC(){
        return this.nbC;
    }

}
