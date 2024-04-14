package Lectures;

public class DoublyLinkedList {
    private Node head;
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value+" --> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Displaying in reverse");
        while(last != null){
            System.out.print(last.value+" --> ");
            last = last.prev;
        }
        System.out.println("START");
    }
    public void insertLast(int value){
        if(head == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        node.prev = last;
        node.next = null;
        last.next = node;
    }
    public void insertAfter(int value, int after){
        if(head == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Node last = head;
        while(last.value != after){
            last = last.next;
            if(last == null){
                System.out.println("element does not exist");
                return;
            }
        }
        if(last.next == null){
            insertLast(value);
            return;
        }
        node.next = last.next;
        last.next = node;
        node.prev = last;
        node.next.prev = node;
    }
    public void deleteFirst(){
        head = head.next;
        head.prev = null;
    }
    public void deleteLast(){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.prev.next = null;
//        System.out.println(temp.value+" "+ temp.prev.value);
    }
    public void delete(int value){
        if(head.value == value){
            deleteFirst();
            return;
        }
        Node temp = head;
        while(temp.value != value){
            temp = temp.next;
            if(temp == null){
                System.out.println("Element not found.");
                return;
            }
        }
        if (temp.next == null){
            deleteLast();
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
        public Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertLast(75);
        dll.insertFirst(45);
        dll.insertFirst(3);
        dll.insertFirst(89);
        dll.insertLast(61);
        dll.display();
//        dll.insertAfter(32,61);
//        dll.insertAfter(10,10);
//        dll.deleteFirst();
//        dll.display();
//        dll.deleteLast();
//        dll.display();
        dll.delete(45);
        dll.display();
    }
}
