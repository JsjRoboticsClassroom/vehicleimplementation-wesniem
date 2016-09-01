package nyc.c4q.wesniemarcelin;

/**
 * Created by wesniemarcelin on 8/31/16.
 */
public class Bicycle implements Vehicle {
    double initialSpeed;
    public Bicycle(double initialSpeed){
        this.initialSpeed = initialSpeed;
    }
    @Override
    public double applyBrakes(){
        while(initialSpeed >0){
            initialSpeed-=5;
        }
        return initialSpeed;
    }
    @Override
    public double speedUp(int delta){
        initialSpeed += delta;
        return initialSpeed;
    }
    @Override
    public double slowDown(int delta){
        initialSpeed-=delta;
        return initialSpeed;
    }

}
