package Assignment.FirstJava.Shapes;
class Shapes{
    public double circle(double radius){
        return 2*radius*Math.PI;
    }
    public double triangle(double sideA, double sideB, double sideC){
        return sideA+sideB+sideC;
    }
    public double equilateralTriangle(double side){
        return 3*side;
    }
    public double square(double side){
        return 4*side;
    }
    public double parallelogram(double sideA, double sideB){
        return 2*(sideA+sideB);
    }
}
public class Perimeter {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        System.out.println(s.circle(56));
        System.out.println(s.equilateralTriangle(5));
    }
}