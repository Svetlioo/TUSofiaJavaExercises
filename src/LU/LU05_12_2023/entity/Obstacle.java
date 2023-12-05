package LU.LU05_12_2023.entity;

public class Obstacle {
    private int position;

    private Effect effect;

    public Obstacle(int position, Effect effect) {
        this.position = position;
        this.effect = effect;
    }

    public void applyEffect(Car car){
        car.encounterObstacle(this);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }
}
