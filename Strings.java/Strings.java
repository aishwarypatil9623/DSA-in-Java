import java.util.*;

public class Strings {
    public static void printletters(String str) {
        for(int i=0; i <str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz@1234");  //IMP => String  are immutable that cannot be changed

        // Scanner sc = new Scanner(System.in);
        // //String name 
        // name = sc.nextLine();
        // System.out.println(name);
        // String Fullname = "Tony Stark";
        // System.out.println(Fullname.length());

        //Concatination 

        String Firstname = "Aishwary";
        String Lastname = "Patil";
        String Fullname = Firstname + " " + Lastname;
        //System.out.println(Fullname.charAt(5));

        printletters(Fullname);
    }
    
}
