package linkedList.problems;

public class LinkedList <T>{
    public Node head;
    public Node tail;
    public int size;

    private void createNewNode(T value){
        Node newNode = new Node();
        newNode.value=value;
        newNode.next=null;
        head=newNode;
        tail=newNode;
        size=1;
    }

    public void add(T value){
        if(head==null){
            createNewNode(value);
            return;
        }
        Node newNode = new Node();
        newNode.value=value;
        newNode.next=null;
        tail.next=newNode;
        tail=newNode;
        size++;
    }

    public void display(){
        Node tempNode = head;
        if(tempNode==null){
            System.out.println("Nothing to display");
            return;
        }
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            if(i<size-1){
                System.out.print(" -> ");
            }
            tempNode=tempNode.next;
        }
        System.out.println();
    }
}
