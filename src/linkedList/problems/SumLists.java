package linkedList.problems;
//Add two Linked list in the reverse order
// 5 -> 3 -> 8  and  1 -> 2 -> 3  ==> 6 -> 5 -> 1 -> 1
public class SumLists {
    static LinkedList sumLists(LinkedList ll1,LinkedList ll2){
        int carry = 0,sum = 0;
        LinkedList ll = new LinkedList();
        Node lla = ll1.head;
        Node llb = ll2.head;
        while(lla!=null||llb!=null){
            int llav = lla!=null ? (Integer) lla.value : 0;
            int llbv = llb!=null ? (Integer) llb.value : 0;

            sum = llav+llbv+carry;
            if(sum>9){
                sum = sum%10;
                carry=1;
            }
            else {
                carry=0;
            }
            ll.add(sum);
            lla = lla.next==null ? null : lla.next;
            llb = llb.next==null ? null : llb.next;
        }
        if(carry==1)
            ll.add(carry);
        return ll;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        ll1.add(5);
        ll1.add(3);
        ll1.add(8);
        ll2.add(1);
        ll2.add(2);
        ll2.add(3);
        ll1.display();
        ll2.display();
        LinkedList<Integer> ll = sumLists(ll1,ll2);
        ll.display();
    }
}
