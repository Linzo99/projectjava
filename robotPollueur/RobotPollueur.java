package robotPollueur;

import robot.Robot;
import mondes.Monde;

public abstract class RobotPollueur extends Robot {
    
    public RobotPollueur(int x, int y, Monde m){
        super(x, y, m);
    }

    public RobotPollueur(Monde m){
        super(m);
    }

    public void polluer(){
        this.m.metPapierGras(this.posy, this.posx);
    }
}
