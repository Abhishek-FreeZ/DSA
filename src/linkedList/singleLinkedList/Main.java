package linkedList.singleLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sLL =  new SingleLinkedList();
        sLL.add(10);
        sLL.add("Hello World");
        sLL.add(10.32);
        sLL.add(1,"abhishek");
        sLL.add("Endl");
        sLL.add(3,1000);
        sLL.delete(new Integer(1));
        sLL.search("Hello World");
//        sLL.delete(new Integer(4));
        sLL.display();
        sLL.search(new Integer(3));
//        System.out.println(sLL.head.value);
    }
}
