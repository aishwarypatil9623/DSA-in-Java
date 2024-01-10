import java.util.ArrayList; // or we may use java.util.*;

public class basics {
    public static void main(String[] args) {  // in java classes name start with capital letter ex. Integer,Boolean,etc
        // arrayList is a part of JavaCollection FrameWork
        //ClassName objectName  = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //reverse print  - O(n) time complexity
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
