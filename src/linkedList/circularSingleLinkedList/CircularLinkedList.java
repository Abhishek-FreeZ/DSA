package linkedList.circularSingleLinkedList;

public class CircularLinkedList<T>{
    public Node head;
    public Node tail;
    public int size;

// Creating New Node
    private Node createNewNode(T value){
        Node node = new Node();
        head = new Node();
        node.value=value;
        node.next=node;
        head=node;
        tail=node;
        size=1;
        return head;
    }

//    Adding values at the end of this node
    public void add(T value){
        if(head==null) {
            createNewNode(value);
            return;
        }
        Node node = new Node();
        node.value=value;
        tail.next = node;
        tail = node;
        node.next=head;
        size++;
    }

//    Adding value at any index
    public void add(int location,T value){
        if(head==null){
            createNewNode(value);
            return;
        }
        Node node = new Node();
        node.value=value;
        if(location==0){
            node.next=head;
            head=node;
            tail.next=node;
        }
        else if(location>=size){
            tail.next = node;
            tail = node;
            node.next=head;
        }
        else {
            Node tempNode = head;
            for(int i=0;i<location-1;i++){
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }

        size++;
    }

//    Display function for node
    public void display(){
        Node tempNode = head;
        if(tempNode==null){
            System.out.println("No value to display");
            return;
        }
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            tempNode = tempNode.next;
            if(i!=size-1)
                System.out.print(" -> ");
        }
        System.out.println();
    }

    //Function to tell if the linked list is empty or not
    public boolean isEmpty(){
        if(head==null||tail==null)
            return true;
        return false;
    }

//    Searching a value in the linked list
    public int indexOf(T value){
        if(head==null){
            return -1;
        }
        Node tempNode = head;
        for(int i=0;i<size;i++){
            if(tempNode.value==value) {
                return i;
            }
            tempNode=tempNode.next;
        }
        return -1;
    }

//    Searching value at any index in linked list

    public void valueAt(Integer location){
        if(location<0||location>=size){
            System.out.println("Index out of bound");
            return;
        }
        Node tempNode = head;
        for(int i=0;i<location;i++){
            tempNode=tempNode.next;
        }
        System.out.println(tempNode.value);
    }

//   Deleting element from circular Single Linked List

    public void delete(Integer location){
        if(head==null){
            System.out.println("No element in linked list");
            return;
        }
        if(location<0)
            return;
        if(location==0){
            if(size==1){
                head=null;
                tail=null;
            }
            else {
                head = head.next;
                tail.next = head;
            }
        }
        else if(location>=size-1){
            if(size==1){
                head=null;
                tail=null;
            }
            else {
                Node tempNode = head;
                for (int i = 0; i < size - 2; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.next = head;
                tail = tempNode;
            }
        }
        else {
            Node tempNode = head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
        }
        size--;
    }

//    Delete all the elements of linked list
    public void deleteAll(){
        if(head==null){
            System.out.println("Already empty");
            return;
        }
        else{
            head=null;
            tail=null;
            size=0;
        }
    }
}
