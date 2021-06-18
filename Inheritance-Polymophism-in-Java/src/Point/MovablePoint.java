package Point;

import java.util.Arrays;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {

    }

    public  MovablePoint (float xSpeed,float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint (float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getXSpeed () {
        return xSpeed;
    }

    public void setYSpeed (float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getYSpeed () {
        return ySpeed;
    }

    public void setSpeed (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = getXSpeed();
        arr[1] = getYSpeed();
        return arr;
    }

    public String toString() {
        return String.format("(%f,%f),speed=(%f,%f)",super.getX(),super.getY(), Arrays.toString(getSpeed()));
    }

//    public MovablePoint move() {
//
//    }
}
