package linkedList.problems;

// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
// nthToLast(linkedlist,3) => 6
public class NthToLast {
    static Node nthToLast(LinkedList ll, int n){
        Node pointer1 = ll.head;
        Node pointer2 = ll.head;
        for(int i=1;i<n;i++){
            pointer2 = pointer2.next;
        }
        while(pointer2.next!=null){
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }
        return pointer1;
    }


    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.display();
        Node n = nthToLast(ll,6);
//        ll.display();
        System.out.println(n.value);
    }
}
