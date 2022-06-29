package linkedList.problems;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    static void deleteDups(LinkedList ll){
        HashSet<Integer> hs = new HashSet<>(); //  Hashset is used to store the unique value in the linked list
        Node curr = ll.head;        // Current value as well as prev value is required in this problem
        Node prev = null;           // Since we have to delete the current value we need to set the next
        while(curr!=null){          // location of previous link to next location of current link
            if(hs.contains(curr.value)){
                prev.next=curr.next;
                ll.size--;
            }
            else {
                hs.add((Integer) curr.value);
                prev=curr;
            }
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(10);
        ll.add(10);
        ll.add(10);
        ll.add(20);
        ll.add(10);
        ll.add(100);
        ll.display();
        deleteDups(ll);
        ll.display();
    }
}
