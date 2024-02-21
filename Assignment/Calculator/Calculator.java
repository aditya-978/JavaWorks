class CannotDivideByZero extends Exception{
    @Override
    public String getMessage(){
        return "Denominator cannot be zero.";
    }

    @Override
    public String toString() {
        return "cannot divide by zero";
    }
}
class InvalidInputException extends Exception{
    @Override
    public String getMessage(){
        return "Invalid Input";
    }
}
class MaxMultiplier extends Exception{
    @Override
    public String getMessage(){
        return "Max multiplier reached";
    }
}
class MaxInput extends Exception{
    @Override
    public String getMessage(){
        return "Max Input Reached";
    }
}
class Cal{
    public void sum(int a, int b){
        try{
            if(a >= 100000 || b >= 100000)
                throw new MaxInput();
            else System.out.println(a+b);
        } catch (MaxInput e) {
            System.out.println(e.getMessage());
        }
    }
    public void sub(int a, int b){
        try{
        if(a >= 100000 || b >= 100000)
            throw new MaxInput();
        else if(a<b)
            System.out.println(b-a);
        else System.out.println(a-b);
    } catch (MaxInput e) {
        System.out.println(e.getMessage());
    }
    }
    public void multiply(int a, int b) {
        try {
            if (a >= 100000 || b >= 100000)
                throw new MaxInput();
            else if (a >= 7000 || b >= 7000) {
                throw new MaxMultiplier();
            } else System.out.println(a * b);
        } catch (MaxInput e) {
            System.out.println(e.getMessage());
        } catch (MaxMultiplier m) {
            System.out.println(m.getMessage());
        }
    }
    public void divide(int a, int b){
        try {
            if (a >= 100000 || b >= 100000)
            throw new MaxInput();
        else if(b == 0){
            throw new CannotDivideByZero();
            }
        else System.out.println(a/b);
        } catch (MaxInput e){
            System.out.println(e.getMessage());
        } catch (CannotDivideByZero cd){
            System.out.println(cd.getMessage());
        }
    }
}
public class Calculator {
    public static void main(String[] args) {
        Cal c = new Cal();
        c.sum(100000,5);
        c.multiply(5,4);
        c.sub(6,9);
        c.divide(2,0);
        c.multiply(7003,5);
    }
}
