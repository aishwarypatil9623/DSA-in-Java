import java.util.ArrayList; // or we may use java.util.*;

public class basics {
    public static void main(String[] args) {  // in java classes name start with capital letter ex. Integer,Boolean,etc
        // arrayList is a part of JavaCollection FrameWork
        //ClassName objectName  = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        list.add(1);
        list.add(2);  // Add Operator 
        list.add(3);  //O(1)
        list.add(4);
        list.add(5);

        list.add(1, 7);  //list.add(indexNo, elementToBeAdded at that index). //O(n)

        //reverse print  - O(n) time complexity
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println(list);

        //Get Operation - O(1)

        int element = list.get(3); //add index name in the bracket 
        System.out.println(element);

        //Delete element - 

        list.remove(2);
        System.out.println(list);

        //Set element at index

        list.set(2,10);  //list.set(indexNo,elementToBeAdded)
        System.out.println(list);

        //Contains

        System.err.println(list.contains(4));
        System.out.println(list.contains(11));

        //Size of an array

        System.out.println(list.size());

        //Print the arrayList

        for(int i=0; i<=list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
