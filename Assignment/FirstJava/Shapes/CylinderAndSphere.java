package Assignment.FirstJava.Shapes;

import java.util.Scanner;

public class CylinderAndSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of cylinder: ");
        float h = sc.nextFloat();
        System.out.print("Enter radius of cylinder: ");
        float r = sc.nextFloat();
        Cylinder cylinder = new Cylinder(r, h);
//        cylinder.setHeight(h);
//        cylinder.setRadius(r);
        System.out.println("The entered radius is: "+ cylinder.getRadius());
        System.out.println("The entered height is: "+ cylinder.getHeight());
        System.out.println("The surface area of cylinder is: "+ cylinder.surfaceAre());
        System.out.println("The volume of cylinder is: "+ cylinder.volume());

        Sphere sphere = new Sphere();
        sphere.setRadius(r);
        System.out.println("The surface area of sphere is: "+ sphere.surfaceAre());
        System.out.println("The volume of sphere is: "+ sphere.volume());
    }
}

class Cylinder{
    private float height, radius;
    //Using getters and Setters to set radius and heights

//    public void setHeight(float h){
//        height = h;
//    }
//    public void setRadius(float r){
//        radius = r;
//    }
    public float getRadius(){
        return radius;
    }
    public float getHeight(){
        return height;
    }

    // Problem 2: Use Constructor to set height and radius
    public Cylinder(float r, float h){
        height = h;
        radius = r;
    }
    public float surfaceAre(){
        float area = (float) ((2*Math.PI*radius*height) + (2*Math.PI*radius*radius));
        return area;
    }
    public float volume(){
        float vol = (float)Math.PI* radius*radius*height;
        return vol;
    }
}

//for Assignment.FirstJava.Shapes.Sphere
class Sphere{
    private float radius;
    public void setRadius(float r){
        radius = r;
    }
    public float surfaceAre(){
        float area = (float) (4*Math.PI*radius*radius);
        return area;
    }
    public float volume(){
        float vol = (float)((4/3)*Math.PI*radius*radius*radius);
        return vol;
    }
}