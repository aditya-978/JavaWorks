package Lectures;
/*
A class which has only one instance(object) is called singleton class.
To make a class singleton, we must declare its constructor as private so that no object can be made using the new keyword.
We declare a private Singleton variable named instance and a getInstance method of Singleton return type, which return the instance variable.
If the instance variable is null, that means no object was created previously, so getInstance method creates an object using constructor.
If instance variable is not null, that means object was created before, so it will return the same instance variable created earlier.
In the main class, only getInstance method can be used instead of constructor to get the instance of Singleton class.
*/
class Singleton {
    private Singleton(){}
    private static Singleton instance;
    public static Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
public class SingletonMain{
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s);System.out.println(s1);System.out.println(s2);
    }
}