public class Linkelist {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);

        //step2 - newNode next = Head
        newNode.next = head;   //link

        //step3 - head = newNode
        head = newNode;
    }

    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = tail;
        tail = newNode;
    }
    public static void main(String[] args) {
        Linkelist ll = new Linkelist();

        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        
    }
    
}
