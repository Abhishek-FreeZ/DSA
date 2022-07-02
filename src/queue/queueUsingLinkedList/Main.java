package queue.queueUsingLinkedList;


public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
//        queue.delete();
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

        queue.enQueue(10);
        queue.deQueue();
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        queue.delete();
    }
}
