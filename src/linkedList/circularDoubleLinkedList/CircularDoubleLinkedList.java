package linkedList.circularDoubleLinkedList;

public class CircularDoubleLinkedList <T>{
    public Node head;
    public Node tail;
    public int size;

    private Node createNewNode(T value){
        Node newNode = new Node();
        newNode.value= value;
        head = newNode;
        tail = newNode;
        newNode.prev = newNode;
        newNode.next=newNode;
        size=1;
        return head;
    }

//    Adding element at the end of Circular Double linked list

    public void add(T value){
        if(head==null){
            createNewNode(value);
            return;
        }
        Node newNode = new Node();
        newNode.value=value;
        newNode.prev=tail;
        newNode.next=head;
        tail.next = newNode;
        head.prev=newNode;
        tail=newNode;
        size++;
    }

//    Adding element at any location of Circular Double linked list

    public void add(int location,T value){
        if(head==null){
            createNewNode(value);
            return;
        }
        Node newNode = new Node();
        newNode.value=value;
        if(location==0){
            newNode.prev=tail;
            newNode.next=head;
            head.prev=newNode;
            tail.next=newNode;
            head=newNode;
        }
        else if(location>=size){
            newNode.next=head;
            newNode.prev=tail;
            tail.next=newNode;
            head.prev=newNode;
            tail=newNode;
        }
        else {
            Node tempNode = head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            newNode.next = tempNode.next;
            newNode.prev = tempNode;
            tempNode.next = newNode;
            tempNode.next.next.prev = newNode;
        }
        size++;
    }
//    Displaying linked list

    public void display(){
        if(head==null){
            System.out.println("Nothing to display");
            return;
        }
        Node tempNode = head;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            if(i<size-1)
                System.out.print(" -> ");
            tempNode=tempNode.next;
        }
        System.out.println();
    }


    //    Displaying in reverse order
    public void display(int order){
        if(head==null){
            System.out.println("Nothing to display");
            return;
        }
        if(order>=0) {
            display();
            return;
        }
        Node tempNode = tail;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            if(i<size-1)
                System.out.print(" -> ");
            tempNode=tempNode.prev;
        }
        System.out.println();
    }

//    Searching an element in double linked list

    public int indexOf( T value){
        if(head==null){
            return -1;
        }
        Node tempNode = head;
        for(int i =0 ;i< size;i++){
            if(tempNode.value==value){
                return i;
            }
            tempNode=tempNode.next;
        }
        return -1;
    }


//    Search value at that index


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


//    Deleting element at any given location

    public void delete(Integer location){
        if(head==null){
            System.out.println("No element in linked list");
            return;
        }
        if(location<0)
            return;
        if(location==0){
            if(size==1){
                head.prev=null;
                head.next=null;
                head=null;
                tail=null;
            }
            else {
                head = head.next;
                head.prev=tail;
                tail.next=head;
            }
        }
        else if(location>=size-1){
            if(size==1){
                head.prev=null;
                head.next=null;
                head=null;
                tail=null;
            }
            else {
                tail = tail.prev;
                tail.next = head;
                head.prev=tail;
            }
        }
        else {
            Node tempNode = head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            tempNode.next.prev = tempNode;
        }
        size--;
    }

//    deleting all element of double linked list

    public void deleteAll(){
        Node tempNode = head;
        for(int i=0;i<size;i++){
            tempNode.prev=null;
            tempNode=tempNode.next;
        }
        head=null;
        tail=null;
    }
}
