import java.util.ArrayList;

public class arraylistwithinanarrya {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();  //List Within List 
        ArrayList<Integer> llist = new ArrayList<>();

        llist.add(1);
        llist.add(2);  
        mainList.add(llist);
        
        ArrayList<Integer> llist2 = new ArrayList<>();
        llist2.add(3);  
        llist2.add(4);
        llist2.add(5);
        mainList.add(llist2);

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currlist = mainList.get(i);
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);

        ArrayList<ArrayList<Integer>> mainnList = new ArrayList<>();  //List Within List 
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
        for(int i = 1; i<=5; i++) {
            list1.add(i*1); //1 2 3 4 5
            list2.add(i*2); //2 4 6 8 10
            list3.add(i*3); //3 6 9 12 15
        }
        mainnList.add(list1);
        mainnList.add(list2);
        mainnList.add(list3);
   
        System.out.println(mainnList);

        for(int i=0; i<mainnList.size(); i++){
            ArrayList<Integer> currlist = mainnList.get(i);
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }

    } 
    
}
