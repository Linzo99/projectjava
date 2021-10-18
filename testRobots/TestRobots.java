package testRobots;

import mondes.Monde;
import pollueurDroit.PollueurToutDroit;
import pollueurSauteur.PollueurSauteur;
import robotNettoyeur.RobotNettoyeur;
import robotNettoyeurDistrait.NettoyeurDistrait;


public class TestRobots{
    public static void main(String[] args) {
        Monde m = new Monde(5, 5);
        System.out.println(m.toString());
        PollueurToutDroit ptd = new PollueurToutDroit(4, m);
        ptd.parcourir();
        System.out.println(m.toString());
        PollueurSauteur ps = new PollueurSauteur(2, 3, m);
        ps.parcourir();
        System.out.println(m.toString());
        NettoyeurDistrait nd = new NettoyeurDistrait(m);
        nd.parcourir();
        System.out.println(m.toString());
        RobotNettoyeur rn = new RobotNettoyeur(m);
        rn.parcourir();
        System.out.println(m.toString());
    }
}