package Lectures;

import java.util.Arrays;

public class CustomArrayList<T> {
    private int DEFAULT_SIZE = 10;
    private Object[] data;
    private  int size;

    public CustomArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    private boolean isFull() {
        return  size == data.length;
    }

    public T remove(){
        return (T) data[--size];
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                ", data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> cal = new CustomArrayList<>();
        cal.add(76);
        cal.add(56);
//        cal.remove();
        System.out.println(cal);
    }
}