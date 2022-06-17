package linkedList.singleLinkedList;

class SingleLinkedList<T>{
    public Node head;
    public Node tail;
    public int size;


    //    Creating New Node
    public Node createNewNode(T value){
        Node node = new Node();
        node.value=value;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //    Adding value to the linked list
    public boolean add(T value){
        if(head==null){
            createNewNode(value);
            return true;
        }
        Node node = new Node();
        node.value=value;
        tail.next = node;
        tail=node;
        size++;
        return true;
    }

    //    Adding value at particular location
    public boolean add(int location,T value){
        if(head==null){
            createNewNode(value);
            return true;
        }
        Node node = new Node();
        node.value = value;
        if(location==0) {
            node.next = head;
            head = node;
        }
        else if(location>=size){
            tail.next=node;
            tail=node;
        }
        else{
            Node tempNode = head;
            int index=0;
            while (index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next =node;
        }
        size++;
        return true;
    }


    //    Display Function
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

    //    Is empty Function
    public boolean isEmpty(){
        if (head==null)
            return true;
        return false;
    }

    //    Search a value in the linkedlist
    public boolean search(T value){
        int index = 0;
        Node tempNode = head;
        while(tempNode!=null){
            if(tempNode.value==value){
                System.out.println("The value ("+value+ ") is at index : "+ index );
                return true;
            }
            tempNode=tempNode.next;
            index++;
        }
        System.out.println("Node Not found ");
        return false;
    }

    //    Search value at a particular index
    public boolean search(Integer index){
        int indexLocal = 0;
        if(index<0||index>size){
            System.out.println("Index out of Bound");
            return false;
        }
        Node tempNode = head;
        while (indexLocal<index){
            tempNode=tempNode.next;
            indexLocal++;
        }
        System.out.println("Value at index "+index+" is :"+tempNode.value);
        return true;
    }


    //    Deleting value from the Linked list with index as input
    public void delete(Integer index){
        if(index<0){
            System.out.println("Index out of bound");
            return;
        }
        if(index==0){
            head=head.next;
            size--;
            if(size==0)
                tail=null;
        }
        else if(index>=size-1){
            if(size==1) {
                head = null;
                tail = null;
                size--;
            }
            else {
                Node tempNode = head;
                while(tempNode.next.next!=null){
                    tempNode=tempNode.next;
                }
                tempNode.next=null;
                tail=tempNode;
                size--;
            }
        }
        else{
            Node tempNode =head;
            int indexLocal =0 ;
            while (indexLocal<index-1){
                tempNode = tempNode.next;
                indexLocal++;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

//    Reversing the linked list

    public void reverse(){
        Node previous = null;
        Node current =head;
        for(int i=0;i<size;i++){
            Node nextNode = current.next;
            current.next =previous;
            previous=current;
            current=nextNode;
        }
        tail = head;
        head = previous;
    }

}