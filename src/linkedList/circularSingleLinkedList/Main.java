package linkedList.circularSingleLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cLL = new CircularLinkedList();
        cLL.createNewNode(10);
        System.out.println(cLL.tail.value);
    }
}
