package linkedList.circularDoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularDoubleLinkedList cdLL = new CircularDoubleLinkedList();
        cdLL.add(10);
        cdLL.add(0,20);
        cdLL.add("Birthday");
        cdLL.add(2,"Happy");
        cdLL.add(4,"End");

//        cdLL.delete(0);
//        System.out.println(cdLL.tail.next.value);
        cdLL.display();
        cdLL.display(-1);

        cdLL.deleteAll();
        cdLL.display();
        System.out.println(cdLL.indexOf("End"));
//        cdLL.valueAt(2);

    }
}
