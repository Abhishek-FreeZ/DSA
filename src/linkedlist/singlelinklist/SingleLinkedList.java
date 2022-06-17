package linkedlist.singlelinklist;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int value){
        head = new Node();
        Node node = new Node();
        node.next=null;
        node.value = value;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

//    inserting new node to the linked list
    public void insertNewNode(int value,int location){
        Node node = new Node();
        node.value =value;
        if(head == null){
            createSingleLinkedList(value);
            return;
        }
        else if(location==0){
            node.next=head;
            head=node;
        }
        else if(location>=size){
            node.next = null;
            tail.next=node;
            tail=node;
        }
        else{
            int index = 0;
            Node tempNode  = head;
            while (index<location-1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

//    Traversing through the single linked list

    public void traverseSingleLinkedList(){
        Node tempNode = head;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            if(i!=size-1)
                System.out.print("->");
            tempNode=tempNode.next;
        }
        System.out.println();
    }

//    Searching in linked list for value
    public boolean searchNode(int value){
        Node tempNode = head;
        for(int i=0;i<size;i++){
            if(tempNode.value==value){
                System.out.println("Node found at location : " +i);
                return true;
            }
            tempNode = tempNode.next;
        }
        System.out.println("Node not found!");
        return false;
    }

//    Searching linked list for index
    public boolean searchNode(Integer index){
        Node tempNode = head;
        if(index<0||index>=size){
            System.out.println("Index out of bound");
            return false;
        }
        for(int i=0;i<index;i++){
            tempNode = tempNode.next;
        }
        System.out.println("Value at index "+index +" is : "+tempNode.value);
        return true;
    }
}
