package linkedList.problems;

// value less than particular value comes on one side and greater goes on the other side
// 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1
// 1 -> 2 -> 3 ->  ||  5 -> 8 -> 5 -> 10
public class Partition {
    static void partition(LinkedList ll,int x){
        Node curr = ll.head;
        Node head = ll.head;
        Node tail = ll.head;
        while(curr!=null){
            Node next = curr.next;
            if((Integer) curr.value < x){
                curr.next = head;
                head = curr;
            }
            else{
                tail.next = curr;
                tail=curr;
            }
            curr=next;
        }
        ll.head=head;
        ll.tail=tail;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(3);
        ll.add(5);
        ll.add(8);
        ll.add(5);
        ll.add(10);
        ll.add(2);
        ll.add(1);
        ll.display();
        partition(ll,5);
        ll.display();
    }
}
