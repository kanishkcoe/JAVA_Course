public class Main {

    public static void main(String[] args) {

        int length = 5;
        int breadth = 10;
        int side = 8;
        double radius = 10;

        System.out.println(area(length, breadth));
        System.out.println(area(side));
        System.out.println(area(radius));
    }

    private static double area(double radius) {
        return Math.PI * radius * radius;
    }

    private static int area(int side) {
        return side * side;
    }

    private static int area(int length, int breadth) {
        return length * breadth;
    }

}
