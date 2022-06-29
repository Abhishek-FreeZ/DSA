package linkedList.problems;

public class Intersection<T> {
    void addSameNode(LinkedList llA, LinkedList llB, T nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
        llA.size++;
        llB.size++;
    }

    Node getKthNode(Node head,int k){
        Node tempNode = head;
        for(int i=0;i<k;i++){
            tempNode=tempNode.next;
        }
        return tempNode;
    }

    Node findIntersection(LinkedList ll1,LinkedList ll2){
        if(ll1.head==null || ll2.head==null) return null;
        if(ll1.tail!=ll2.tail) return null;
        Node longer = null;
        Node shorter = null;
        if(ll1.size>ll2.size){
            longer = ll1.head;
            shorter=ll2.head;
        }
        else {
            longer = ll2.head;
            shorter = ll1.head;
        }

        longer = getKthNode(longer,Math.abs(ll1.size-ll2.size));
        while(longer!=shorter){
            longer=longer.next;
            shorter=shorter.next;
        }
        return longer;
    }

    public static void main(String[] args) {
        LinkedList<Integer> llA = new LinkedList<>();
        LinkedList<Integer> llB = new LinkedList<>();
        llA.add(1);
        llA.add(2);
        llA.add(2);
        llB.add(1);
        llB.add(2);
        Intersection intersection = new Intersection<>();
        intersection.addSameNode(llA,llB,3);
        intersection.addSameNode(llA,llB,4);

        llA.display();
        llB.display();

        Node n = intersection.findIntersection(llA,llB);
        System.out.println(n.value);
    }
}
