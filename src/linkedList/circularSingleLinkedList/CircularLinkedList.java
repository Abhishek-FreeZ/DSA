package linkedList.circularSingleLinkedList;

public class CircularLinkedList<T>{
    public Node head;
    public Node tail;
    public int size;

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
}
