import java.util.*;

public class substring {
    public static String substring1(String str,int si,int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]) {
        String str = "Hello World";
        System.out.println(substring1(str,0,5));

        String fruits[] = {"mango", "banana", "apple"};

        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);

    }
}
