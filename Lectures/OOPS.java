package Lectures;

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
class Student {
    Student(){
        this(13,"Aditya", 67);
    }
    Student(int roll, String name, int marks){
        System.out.println(roll);
        System.out.println(name);
        System.out.println(marks);
    }
}