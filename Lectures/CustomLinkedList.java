package Lectures;

public class CustomLinkedList {
    private Node head; //reference variable pointing to the starting node.
    private Node tail; //reference variable pointing to the ending node.
    private int size;

    public CustomLinkedList() {
        this.size = 0;
    }
    public void insertFirst(int value){  // insert the element given at the index = 0th position.
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;
    }
    public void display(){  //displays the entire linked list.
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void add(int value){  //adds the element at the last index of linked list.
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertAt(int index, int value){  //insert the given element at the given position/index.
        if(index>size){
            throw new ArrayIndexOutOfBoundsException("index is out of bound");
        }
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            add(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }
    public void deleteFirst(){  //deletes the first element of the linked list.
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }
    public void deleteLast(){  //deletes the last element of the linked list.
        if (size <= 1){
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < size-2; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }
    public void removeAt(int index){  //deletes the element of the linked list at particular index.
        if(index>size){
            throw new ArrayIndexOutOfBoundsException("index is out of bound");
        }
        if(index == 0){
            deleteFirst();
            return;
        }
        if (index == size-1){
            deleteLast();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public int indexOf(int value){  //returns the index of searched value(if present), else returns -1.
        Node temp = head;
        int index = 0;
        while (temp.value != value){
            index++;
            temp = temp.next;
            if (temp == null){
                return -1;
            }
        }
        return index;
    }

    private class Node{
        private int value;
        private Node next; //reference variable that point to the object that is provided
        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    private Node insertElement(int val, int index, Node node){           //using recursion
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertElement(val, --index, node.next);
        return node;
    }
    public void insertRec(int val, int index){
        head = insertElement(val, index, head);
    }

    public void removeDuplicates(){  //removes the duplicate element present in the linked list.
        Node node = head;
        while(node.next!= null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            } else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    public Node middleElement(){  //returns the middle element of the linked list.
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private void reverse(Node node){       //reversal a linked list using recursion
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverse(){
        if(size < 2){
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = (present != null) ? present.next : null;;
        while (present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
    }

    public void reverseBetween(int from, int to){
        if(from == to){
            return;
        }
        Node current = head;
        Node previous = null;
        for (int i = 0; current!=null && i < from-1; i++) {
            previous = current;
            current = current.next;
        }
        Node last = previous;
        Node newEnd = current;
        Node nexxt = current.next;
        for (int i = 0; current!=null && i < to-from+1; i++) {
            current.next = previous;
            previous = current;
            current = nexxt;
            if(nexxt != null){
                nexxt = nexxt.next;
            }
        }
        if (last != null){
            last.next = previous;
        } else{
            head = previous;
        }
        newEnd.next = current;
    }

    public void bubbleSort(){
        bubbleSort(size-1, 0);
    }

    private void bubbleSort(int row, int col) {
        if(row == 0){
            return;
        }
        if(col<row){
            Node first = get(col);
            Node second = get(col+1);
            if(first.value > second.value){
                //swap
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if(second == tail){
                    Node prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else{
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col+1);
        } else {
            bubbleSort(row-1, 0);
        }
    }

    private Node get(int index) {  //returns the Node for a particular value
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public static CustomLinkedList merge(CustomLinkedList l1, CustomLinkedList l2){    //returns the linked list after merging two given linked list.
        Node head1 = l1.head;
        Node head2 = l2.head;
        CustomLinkedList ans = new CustomLinkedList();
        while(head1!=null && head2!=null){
            if(head1.value<head2.value){
                ans.add(head1.value);
                head1 = head1.next;
            } else {
                ans.add(head2.value);
                head2 = head2.next;
            }
        }
        while(head1!=null){
            ans.add(head1.value);
            head1 = head1.next;
        }
        while(head2!=null){
            ans.add(head2.value);
            head2 = head2.next;
        }
        return ans;
    }

    public static void main(String[] args) {
//        CustomLinkedList list = new CustomLinkedList();
//        list.add(1);
//        list.add(2);
//        list.insertFirst(1);
//        list.add(4);
//        list.insertAt(2, 88);
//        list.insertAt(2, 7);
//        list.display();
//        list.deleteFirst();
//        list.display();
//        list.removeAt(5);
//        list.display();
//        list.deleteLast();
//        list.removeDuplicates();
//        list.display();
//        System.out.println(list.indexOf(65));

        CustomLinkedList list2 = new CustomLinkedList();
        list2.add(1);
        list2.add(6);
        list2.add(5);
        list2.add(2);
        list2.add(9);
        list2.display();

//        list2.bubbleSort();
//        list2.reverseBetween(2,5);
//        list2.display();
//        list2.display();


//        CustomLinkedList ans = CustomLinkedList.merge(list, list2);
//        ans.display();
    }
}