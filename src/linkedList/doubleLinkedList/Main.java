package linkedList.doubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList dLL = new DoubleLinkedList();
        dLL.add("Hello");
        dLL.add("World");
        dLL.add(0,10);
        dLL.add(4,"End");

        dLL.display();
        dLL.display(-1);
//        dLL.indexOf("End");
//        dLL.valueAt(0);
        dLL.delete(dLL.indexOf(10));
        dLL.display();
        dLL.display(-1);
        System.out.println(dLL.head.value);
        System.out.println(dLL.tail.value);
        dLL.deleteAll();
        dLL.display();
    }
}
