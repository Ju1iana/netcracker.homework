package u.pankratova.myPoint;

public class MyPoint {
    private int x, y = 0;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] array = new int[2];
        array[0] = this.x;
        array[1] = this.y;
        return array;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }


    // distance from this point to the given point at (x,y)
    public double distance(int x, int y) {
        int nX = this.x - x;
        int nY = this.y - y;
        return Math.sqrt(nX * nX + nY * nY);
    }

    // distance from this point to the given instance of MyPoint
    public double distance(MyPoint another) {
        int nX = this.x - another.x;
        int nY = this.y - another.y;
        return Math.sqrt(nX * nX + nY * nY);
    }

    // distance from this point to (0,0)
    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint myPoint = (MyPoint) o;
        return x == myPoint.x && y == myPoint.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
