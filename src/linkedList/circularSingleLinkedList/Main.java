package linkedList.circularSingleLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cLL = new CircularLinkedList();
        cLL.add(10);
        cLL.add("Hello");
        cLL.add("World");
        cLL.add(0,"Start");
        cLL.add(4,"End");
        cLL.display();
//        System.out.println(cLL.tail.next.value);
        cLL.valueAt(3);
        cLL.delete(cLL.indexOf("End"));
        cLL.display();

        System.out.println(cLL.tail.value);
    }
}
