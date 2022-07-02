package queue.queueUsingLinkedList;

public class LinkedList <T>{
    Node head;
    Node tail;
    int size;


//    Creating New Node
    private void createNewNode(T value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        size=1;
        head = newNode;
        tail = newNode;
    }

//    Adding at the end of Linked List
    public void add(T value){
        if(head==null){
            createNewNode(value);
            return;
        }
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }


//    Deleting from the start of Linked List

    public void delete(){
        head = head.next;
        size--;
        if(size == 0){
            head = null;
            tail = null;
        }
    }

//    display function

    public void display(){
        Node tempNode = head;
        while (tempNode!=null){
            System.out.print(tempNode.value);
            if(tempNode.next!=null)
                System.out.print(" -> ");
            tempNode=tempNode.next;
        }
        System.out.println();
    }
}
