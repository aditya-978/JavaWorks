package Lectures;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int pointer = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size]; 
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!");
            return false;
        }
        pointer++;
        data[pointer] = item;
        return true;
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop from empty stack");
        }
        int removed = data[pointer];
        pointer--;
        return removed;
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot peek from empty stack");
        }
        return data[pointer];
    }

    boolean isFull() {
        return pointer == data.length -1; //pointer is at last index
    }
    private boolean isEmpty() {
        return pointer == -1; //pointer is at last index
    }
}
