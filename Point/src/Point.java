public class Point {
    private int x;
    private int y;

    public Point(){
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double result = Math.sqrt((0 - this.x) * (0-this.x) + (0 - this.y)* (0-this.y));
        return  result;
    }

    public double distance(Point otherPoint) {
        double result = Math.sqrt((otherPoint.x - this.x) * (otherPoint.x-this.x) + (otherPoint.y - this.y)* (otherPoint.y-this.y));
        return  result;
    }

    public double distance(int x, int y) {
        double result = Math.sqrt((x - this.x) * (x-this.x) + (y - this.y)* (y-this.y));
        return  result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
