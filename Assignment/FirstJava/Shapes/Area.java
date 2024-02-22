package Assignment.FirstJava.Shapes;
public class Area {
    static float circle(float radius){
        return (float) Math.PI*radius*radius;
    }
    static float equilateralTriangle(float side){
        return (float) Math.sqrt(3)/4*(side*side);
    }
    static float triangle(float base, float height){
        return (float) 0.5*base*height;
    }
    static float rectangle(float length, float width){
        return (float) length*width;
    }
    static float parallelogram(float base, float height){
        return (float) base*height;
    }

    public static void main(String[] args) {
        float areaOfCircle = circle(25);
        System.out.println(areaOfCircle);
    }
}
