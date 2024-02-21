public class OOPsPracticeSet {
    public static void main(String[] args) {
        Employees e1 = new Employees();
        e1.salary = 10000;
        System.out.println(e1.getSalary());
        e1.setName("Aditya");
        System.out.println(e1.getName());

        Cellphone c1 = new Cellphone();
        c1.ringing();

        Square s1 = new Square();
        s1.setSide(5);
        System.out.println("The area of square is: "+ s1.area());
        System.out.println("The perimeter of square is: "+ s1.perimeter());
    }
}
// Problem 1: create a class Employee and return its salary. Set a name of the employee and return the name
class Employees{
    int salary;String name;
    int getSalary(){
        return salary;
    }
    void setName(String sName){
        name = sName;
    }
    String getName(){
        return name;
    }

}
// Problem 2: Create a class Cellphone and declare its methods such as: ringing, vibrating etc.
class Cellphone{
    void ringing(){
        System.out.println("The phone is ringing.");
    }
    void vibrating(){
        System.out.println("The phone is vibrating.");
    }
    void silent(){
        System.out.println("the phone is silent.");
    }
}

// Problem 3: Create a class Square with methods to initialize its perimeter, sides, area etc.
class Square{
    int side, area, perimeter;
    public void setSide(int sides){
        side = sides;
    }
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}