package linkedList.singleLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sLL =  new SingleLinkedList();
        sLL.add(10);
        sLL.add("Hello");
        sLL.add("World");
        sLL.add(0,"Start");
        sLL.add("End");
        System.out.println(sLL.indexOf("Hello"));
        sLL.display();
        sLL.reverse();
        sLL.display();
        System.out.println(sLL.head.value);
        System.out.println(sLL.tail.value);
//        System.out.println(sLL.head);
//        System.out.println(sLL.head.value);
    }
}
