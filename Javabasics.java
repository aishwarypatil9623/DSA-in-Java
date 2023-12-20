import java.util.*;
public class Javabasics {

    public static void printpairs(int numbers[]){
        for(int i=0;i<=numbers.length; i++){
            int curr= numbers[i];      // 2,4,6,8
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int numbers[]= {2,4,6,8,10};
        printpairs(numbers); 
    }
}
                           // Functions which are written within classes are called methods
                            //stack overflow --> Errors problems --> Solutionscd