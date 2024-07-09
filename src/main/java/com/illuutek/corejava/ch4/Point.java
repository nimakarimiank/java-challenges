package com.illuutek.corejava.ch4;

public record Point(double x, double y) {
    public Point(){this(0,0);}
    public double distanceFromOrigin(){return Math.hypot(x,y);}
    public static Point Origin = new Point();
    public static double distance (Point a, Point b){
        return Math.hypot(a.x - b.x, a.y - b.y);
    }
}
