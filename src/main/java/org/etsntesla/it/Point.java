package org.etsntesla.it;

public class Point {
    double x, y;

    public Point(double i, double i1){
        x=i;
        y=i1;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double Radius(){

        double distance = 0;
        distance=Math.sqrt(x*x + y*y);
        return distance;
    }

    public double Distance(Point point){
        double distance = 0;
        double a = point.x - this.x;
        double b = point.y - this.y;
        return distance = Math.sqrt(a*a + b*b);
    }

    public double Distance (double a, double b){
        double x = a-this.x;
        double y = a-this.y;
        return Math.sqrt(x*x + y*y);
    }


}