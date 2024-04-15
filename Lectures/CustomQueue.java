package Lectures;

public class CustomQueue {
    protected  int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }
    boolean isFull() {
        return end == data.length -1; //pointer is at last index
    }
    private boolean isEmpty() {
        return end == 0; //pointer is at last index
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception {  //takes O(n) times complexity to remove an item.
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
//            if(i == data.length-1){
//                data[i] = 0;
//            }
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int get() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!!");
        }
        return data[0];
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.println(data[i]+" ");
        }
        System.out.println("End");
    }
}
class Main{
    public static void main(String[] args) throws Exception {
//        CustomStack cs = new CustomStack();
//        cs.push(45);
//        cs.push(1);
//        cs.push(87);
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.peek());
//        System.out.println(cs.pop());

//        CustomStack ds = new DynamicStack();
//        ds.push(20);
//        ds.push(78);
//        ds.push(10);
//
//        System.out.println(ds.peek());
//        System.out.println(ds.pop());
//        System.out.println(ds.pop());

        CircularQueue cq = new CircularQueue();
        cq.insert(45);
        cq.insert(87);
        cq.insert(3);
        cq.display();

        cq.remove();
        cq.insert(61);cq.remove();cq.insert(1);
        cq.display();
    }
}
