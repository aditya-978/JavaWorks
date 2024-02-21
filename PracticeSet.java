public class PracticeSet {
    public static void main(String[] args) {
        CylinderInherit cir = new CylinderInherit();
        cir.setRadius(3.4f);
        cir.setHeight(5.4f);
        System.out.println(cir.area());
        System.out.println(cir.volume());
    }
}

class Circle{
    float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    float area(){
        System.out.println("area of circle is: ");
        return (float) (Math.PI*radius*radius);
    }
}
class CylinderInherit extends Circle{
    float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    float area() {
        System.out.println("area of cylinder is: ");
        return (float) ((2*Math.PI*radius*height) + (2*Math.PI*radius*radius));
    }
    float volume() {
        System.out.println("volume of cylinder is: ");
        return (float) Math.PI * radius * radius * height;
    }
}
