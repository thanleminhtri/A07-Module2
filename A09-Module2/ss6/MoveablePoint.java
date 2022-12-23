package com.codegym.ss6;

public class MoveablePoint extends Point{
    private  float xSpeed;
    private float ySpeed;

    public  MoveablePoint(){
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void  setSpeed( float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }public float[] Speed(float xSpeed, float ySpeed){
        float[] floats ={xSpeed,ySpeed};
        return floats;
    }
    public float move(float x, float y ,float xSpeed, float ySpeed){
        x += xSpeed;
        y += ySpeed;
        return x+y;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +super.toString()+
                "Speed=" + xSpeed +ySpeed+
                '}';
    }
}
