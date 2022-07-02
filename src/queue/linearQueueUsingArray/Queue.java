package queue.linearQueueUsingArray;

public class Queue {
    int[] arr;
    int beginningOfQueue;
    int topOfQueue;
    int size;

    public Queue(int size){
        this.size = size;
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("Linear Queue Created with size : "+size);
    }

    public boolean isEmpty(){
        if(beginningOfQueue==-1||beginningOfQueue==size)
            return true;
        return false;
    }

    public boolean isFull(){
        if(topOfQueue==size-1 && beginningOfQueue<size)
            return true;
        return false;
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("Queue is full ");
            return;
        }
        if(isEmpty()){
            arr = new int[size];
            beginningOfQueue=0;
            topOfQueue=0;
            arr[topOfQueue]=value;
            System.out.println("Value ( "+ value+" )" +" is succefully added");
        }
        else {
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Value ( "+ value+" )" +" is succefully added");
        }

    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int result = arr[beginningOfQueue];
        beginningOfQueue++;
        return result;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[beginningOfQueue];
    }

    public void delete(){
        arr=null;
        beginningOfQueue=-1;
        topOfQueue=-1;
        System.out.println("Successfully deleted");
    }
}
