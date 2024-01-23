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

    public void print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }

    private Node merge(Node head1, Node head2) {
        Node mergeDLL = new Node(-1);
        Node temp = mergeDLL;

        while (head1 != null && head2 != null){
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;            
        }

        return mergeDLL.next;
    }

    public Node mergeSort(Node head){
        if(head == null && head.next == null) {
            return head; 
        }
        //find mid
        Node mid = getMid(head);
        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft,newRight);
    }
    public static void main(String[] args) {
        //create - object int, float,boolean -> Integer, Float, Character
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addFirst(0);
        // // 0->1->2
        // System.out.println(ll);
        // //remove
        // ll.removeLast();
        // ll.removeFirst();
        // System.out.println(ll);

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        //5->4->3->2->1

        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();

    }
    

}
