public class Linkelist {
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

    public void addfirst(int data) {     
        // step1 = create new node
        Node newNode = new Node(data);
        size++;

        // step2 - newNode next = Head
        newNode.next = head;   // link

        // step3 - head = newNode
        head = newNode;
        if (tail == null) {
            tail = head; // Update tail if it is null
        }
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

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

    public void add(int idx, int data){
        if(idx == 0) {
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        // i = idx -1;  temp  -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println();
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val =head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }
    
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
    
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
    
        int val = tail.data;
        tail = prev;
        tail.next = null;
        size--;
        return val;
    }
    
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0; 

        while (temp != null) {
            if(temp.data == key) { // Key Found
                return i;
            }
            temp = temp.next;
            i++;            
        }

        //key not found 
        return -1;
    }

    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }

        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head; 
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthNodefromEnd(int n){
        int sz = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz) {  //for remoce first operation
            head = head.next;
            return;
        }

        //sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    //Slow fast Approach
    public Node findmis(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //slow +1
            fast = fast.next.next; //fast +2
        }
        return slow;
    }

    public boolean checkpalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // Step 1 :- Find Mid
        Node midNode = findmis(head);

        // Step 2 :- Reverse 2nd Half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head
        Node left = head; // 

        // Step 3 :- Check left Half & Right Half 
        while(right != null){
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
    public static void main(String[] args) {
        Linkelist ll = new Linkelist();

        ll.print();
        ll.addfirst(2);
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(4);
        ll.print();
        ll.add(2, 9); //index,data

        ll.print();
        //System.out.println(ll.size);

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));

        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));

        ll.print();
        ll.reverse();
        ll.print();

        ll.deleteNthNodefromEnd(3);
        ll.print();

        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(2);
        ll.addlast(1);

        ll.print();
        System.out.println(ll.checkpalindrome());

    }
}