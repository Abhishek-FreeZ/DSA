package linkedList.circularSingleLinkedList;

public class CircularLinkedList<T>{
    public Node head;
    public Node tail;
    public int size;

// Creating New Node
    public Node createNewNode(T value){
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
}
