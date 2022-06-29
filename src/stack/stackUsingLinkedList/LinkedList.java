package stack.stackUsingLinkedList;

public class LinkedList <T>{
    public Node head;
    public Node tail;
    public int size;

    private void createNewNode(T value){
        Node newNode = new Node();
        newNode.value=value;
        newNode.next=null;
        head=newNode;
        tail= newNode;
        size=1;
    }

    public void add(T value){                   // Add Method to insert at the start of the linked list
        if(head==null){
            createNewNode(value);
            return;
        }
        Node newNode = new Node();
        newNode.value= value;
        newNode.next=head;
        head=newNode;
        size++;
    }

    public void delete(){                       // Delete method to delete one element from the start of linked list
        if(size==1){
            head=null;
            return;
        }
        head = head.next;
    }

}
