package stack.stackUsingArray;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        stack.delete();
        System.out.println(stack.isEmpty());
    }
}
