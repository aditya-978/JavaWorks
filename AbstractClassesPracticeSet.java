abstract  class Telephone{
    abstract void ring();
    abstract void lift();
    void disconnect(){
        System.out.println("call disconnected!");
    }
}
class SmartPhone extends Telephone{

    @Override
    void ring() {
        System.out.println("incoming call");
    }

    @Override
    void lift() {
        System.out.println("call connected!");
    }
}
public class AbstractClassesPracticeSet {
    public static void main(String[] args) {
        Telephone t = new SmartPhone();
        t.ring();
        t.lift();
        t.disconnect();
    }
}
