import java.util.ArrayList;

public class Swap {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));  // value at index 1 == value at index 2 
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);  // Add Operator 
        list.add(3);  //O(1)
        list.add(4);
        list.add(5);
        System.out.println(list);
        int idx1 = 1, idx2 = 3;
        swap(list, idx1, idx2);
        System.err.println(list);
    }
    
}
