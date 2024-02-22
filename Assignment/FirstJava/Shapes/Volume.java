package Assignment.FirstJava.Shapes;
public class Volume {
    void prism(double base, double height){
        System.out.println(base*height);
    }
    void cone(double radius, double height){
        double answer = (Math.PI*radius*radius*height)/3;
        System.out.println(answer);
    }
    void hemisphere(double radius){
        double answer = (2*Math.PI*radius*radius*radius)/3;
        System.out.println(answer);
    }
    void pyramid(double length, double width, double height){
        System.out.println((length*width*height)/3);
    }
    void cuboid(double length, double base, double height){
        System.out.println(length*base*height);
    }

    public static void main(String[] args) {
        Volume v = new Volume();
        v.hemisphere(25);
    }
}
