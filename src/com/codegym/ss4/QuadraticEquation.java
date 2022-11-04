package com.codegym.ss4;

public class QuadraticEquation {
  double a,b,c;
  public QuadraticEquation(double a,double b,double c){
      this.a=a;
      this.b=b;
      this.c=c;
  }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminan(){
        double delta = Math.pow(this.b,2)-4*this.a*this.c;
        return delta;
    }

    public double getRoot1(){
        double x1 = ((-this.b + Math.sqrt(getDiscriminan())) / (2*this.a));
        return x1;
    }
    public double getRoot2(){
        double x2 = ((-this.b - Math.sqrt(getDiscriminan())) / (2*this.a));
        return x2;
    }

    public static void main(String[] args) {
        QuadraticEquation a = new QuadraticEquation(1.0,2,1);
        System.out.println(a.getRoot1() + " " + a.getRoot2());

    }
}
