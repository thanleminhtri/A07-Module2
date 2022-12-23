package com.codegym.ss6;

public class Point3D extends Point2D {
        private float z;
        public Point3D() {
        }
        public Point3D(float x, float y, float z) {
            super(x, y);
            this.z = z;
        }
        public float getZ() {
            return z;
        }
        public void setZ(float z) {
            this.z = z;
        }
    public float[] getXYZ( float x, float y,float z){
        float[] floats ={x,y,z};
        return  floats;
    }
        @Override
        public String toString() {
            return "Point3D(" +
                    "x=" + super.getX() +
                    ",y=" + super.getY() +
                    ",z=" + this.z +
                    ')';
        }

    }