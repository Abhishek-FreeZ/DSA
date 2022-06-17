package linkedlist.singlelinklist;

public class Main {
    public static void main(String[] args) {

        SingleLinkedList sLL = new SingleLinkedList();
        sLL.createSingleLinkedList(20);
        sLL.insertNewNode(10,0);
        sLL.insertNewNode(40,6);
        sLL.insertNewNode(30,2);
        sLL.insertNewNode(123123,100);
        sLL.traverseSingleLinkedList();
        sLL.searchNode(20);
        sLL.searchNode(new Integer(5));

    }
}
