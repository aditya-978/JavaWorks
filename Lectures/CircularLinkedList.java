package Lectures;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    public void insert(int value){
        Node node = new Node(value);
        if (head == null){
            head=node;
            tail=node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void delete(int value){
        if(head == null){
            return;
        }
        if(head.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        Node temp = head.next;
        do{
            Node next = temp.next;
            if(next.value == value){
                temp.next = next.next;
                break;
            }
            temp = temp.next;
        } while (temp!=head);
        if(temp==head){
            System.out.println("Element not found.");
        }
    }
    public void display(){
        Node node = head;
        if(head!=null){
            do{
                System.out.print(node.value+ " --> ");
                node = node.next;
            } while (node!=head);
            System.out.println("HEAD");
        }
    }
    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(35);
        cll.insert(75);
        cll.insert(31);
        cll.insert(70);
        cll.insert(2);
        cll.display();
        cll.delete(7*5);
        cll.display();
    }
}
