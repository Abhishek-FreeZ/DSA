package stack.stackUsingLinkedList;

public class Stack {
    LinkedList linkedList;

//    Constructor to initialize the stack with empty linked list

    public Stack(){
        linkedList = new LinkedList();
    }


//    Pushing value in the stack (to do so we insert value at the starting of linked list )
    public void push(int value){
        linkedList.add(value);
        System.out.println("Added Successfully");
    }

//    isEmpty method to chexk if the stack is empty or not
    public boolean isEmpty(){
        if(linkedList.head==null)
            return true;
        return false;
    }

//    pop method to remove one element from the stack ( deleting first element of the linked list)

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is already empty");
            return -1;
        }
        int topVal = (Integer) linkedList.head.value;
        linkedList.delete();
        return topVal;
    }

//    peek method to get the top element

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is already empty");
            return -1;
        }
        return (Integer) linkedList.head.value;
    }

//    delete method to delete the complete stack

    public void delete(){
        linkedList.head = null;
        System.out.println("Successfully deleted");
    }
}
