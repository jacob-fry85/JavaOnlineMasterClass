public class Main {
    public static void main(String[] args) {
       /* area(5.0);
        area(-1);
        area(5.0, 4.0);
        area(-1.0,4.0);*/
        area(8.5);
    }

    public static double area(double radius) {
        if(radius < 0) {
            return -1.0;
        }
        double result = Math.PI * radius * radius;
        System.out.println(result);
        return result;
    }

    public static double area(double x, double y) {
        if(x < 0 | y < 0) {
            return -1.0;
        }
        double result = x * y;
        //System.out.println(result);
        return result;
    }
}
