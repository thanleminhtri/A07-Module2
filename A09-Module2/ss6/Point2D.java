package com.codegym.ss6;

public class Point2D {
        private float x;
        private float y;

        public Point2D() {
        }

        public Point2D(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }
        public float[] getXY( float x, float y){
            float[] floats ={x,y};
            return  floats;
        }

        @Override
        public String toString() {
            return "Point2D(" +
                    "x=" + this.x +
                    ",y=" + this.y +
                    ')';
        }


    }

