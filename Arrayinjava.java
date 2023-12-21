import java.util.*;

public class Arrayinjava {
    public static int getlargest(int numbers[]){
        int largest=  Integer.MIN_VALUE;   //- Infinity
        int smallest= Integer.MAX_VALUE;

        for(int i =0; i<numbers.length; i++){
            if (numbers[i]>largest) {
                largest = numbers[i];
            }
            if (numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest Value is "+smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,32,14,16};
        System.out.println("Largest Value is "+ getlargest(numbers));
        }
}    
