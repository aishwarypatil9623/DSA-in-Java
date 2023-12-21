import java.util.*;

public class Arrayinjava {
    public static void reverse(int numbers[]){
        int first = 0,last  = numbers.length-1;
        
        while(first<last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;                                 //first index will move forward
            last--;                                  //last index will move backwards
        }

    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,32,14,16};

        reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        }   
}    
