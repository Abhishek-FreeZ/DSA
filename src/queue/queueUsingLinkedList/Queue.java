package queue.queueUsingLinkedList;

public class Queue {
    LinkedList list;

    public Queue(){
        list = new LinkedList();
        System.out.println("Queue Created Successfully");
    }

    public boolean isEmpty(){
        if(list.head==null)
            return true;
        return false;
    }

    public void enQueue(int value){
        list.add(value);
        System.out.println("Value ( "+ value+" )" +" is succefully added");
    }


    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int result = (Integer) list.head.value;
        list.delete();
        return result;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return (Integer) list.head.value;
    }

    public void delete(){
        list.size=0;
        list.head= list.tail=null;
        System.out.println("Deleted Successfully");
    }
}
