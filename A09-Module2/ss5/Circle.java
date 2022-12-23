package com.codegym.ss5;

public class Circle {
        private double radius = 1.0;
        private String color = "red";

        public Circle() {
        }
        public Circle( double radius){
            this.radius = radius;
        }

        public double getRadius () {
            return radius;
        }
        public double  getArea(){
            double area;
            return  area=radius*3.14;

        }
    }