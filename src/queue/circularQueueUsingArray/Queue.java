package queue.circularQueueUsingArray;

public class Queue {

    int[] arr;
    int beginningOfQueue;
    int topOfQueue;
    int size;

    public Queue(int size){
        this.arr = new int[size];
        this.size = size;
        beginningOfQueue= -1;
        topOfQueue = -1;
        System.out.println("Circular Queue Created with size :" +size);
    }

    public boolean isEmpty(){
        if(topOfQueue==-1)
            return true;
        return false;
    }

    public boolean isFull(){
        if(topOfQueue+1 == beginningOfQueue)
            return true;
        else if(beginningOfQueue==0 && topOfQueue == size-1)
            return true;
        return false;
    }


    public void enQueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            arr = new int[size];
            topOfQueue = 0;
            beginningOfQueue = 0;
            arr[topOfQueue] = value;
            System.out.println("Value ( "+value+" ) is successfully added");
        }
        else{
            if(topOfQueue==size-1)
                topOfQueue=0;
            else
                topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Value ( "+value+" ) is successfully added");
        }
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int result = arr[beginningOfQueue];
        arr[beginningOfQueue]=0;
        if(beginningOfQueue+1==size)
            beginningOfQueue = 0;
        else if(beginningOfQueue == topOfQueue)
            beginningOfQueue=topOfQueue=-1;
        else
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
