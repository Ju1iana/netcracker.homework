
/*
* Implement an immutable class Point that describes a point in the plane.
* Provide a constructor to set it to a specific point, a no-arg constructor to
* set it to the origin, and methods getX, getY, translate, and scale. The translation
* method moves the point by a given amount in x- and y-direction. The
* scale method scales both coordinates by a given factor. Implement these
* methods so that they return new points with the results. For example,
* Point p = new Point(3, 4).translate(1, 3).scale(0.5);
* should set p to a point with coordinates (2, 3.5).*/

package u.pankratova.ch2;

import java.util.Objects;

public final class Point {
    private double x = 0;
    private double y = 0;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y){
        return (new Point(this.x + x, this.y + y));
    }

    public Point scale(double scale){
        return (new Point(this.x * scale, this.y * scale));
    }

    @Override
    public String toString() {
        return "Point with new coordinates: {" + getX() + ", " + getY() + "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

    /* test
    * --> Point point = new Point(3,4).translate(1,3).scale(0.5);
    * Point with new coordinates: {2.0, 3.5}
    * */