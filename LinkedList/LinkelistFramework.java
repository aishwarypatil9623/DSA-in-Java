import java.util.LinkedList;

import org.w3c.dom.Node;

public class LinkelistFramework {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }

    private Node merge(Node head1, Node )

    public Node MergeSort(Node head){
        if(head == null && head.next == null) {
            return head; 
        }
        //find mid
        Node mid = getMid();
        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        MergeSort(head);
        MergeSort(rightHead);

        //merge
    }
    public static void main(String[] args) {
        //create - object int, float,boolean -> Integer, Float, Character
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // 0->1->2
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
    

}
