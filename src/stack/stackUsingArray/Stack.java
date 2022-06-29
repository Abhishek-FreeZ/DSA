package stack.stackUsingArray;

public class Stack {
    int[] arr;
    int topOfStack;

//    Constructor for creating stack of given size
    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
    }


//   isEmpty function to check if the stack is empty or not
    public boolean isEmpty(){
        if(topOfStack==-1)
            return true;
        return false;
    }

    //   isFull function to check if the stack is full or not
    public boolean isFull(){
        if(topOfStack== arr.length-1)
            return true;
        return false;
    }

//    Push function to add one element to the stack
    public void push(int value){
        if(isFull()) {
            System.out.println("Stack is already full");
            return;
        }
        arr[topOfStack+1]=value;
        topOfStack++;
        System.out.println("Added successfully");
    }


//    Pop function to remove one element from the stack

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        topOfStack--;
        return arr[topOfStack+1];
    }


//    Peek function to check the element at the top of stack

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[topOfStack];
    }

//    Delete function to delete every element of the stack

    public void delete(){
        arr=null;
        topOfStack=-1;
        System.out.println("Successfully deleted");
    }
}
