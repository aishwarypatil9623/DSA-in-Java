import java.util.*;

public class Arrayinjava {
    public static void maxsubarrays(int numbers[]){
        int currsum=0;

        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length; i++){
            int start=i;
            for(int j=i;j<numbers.length; j++){
                int end = j;
                currsum=0;
                for(int k=start; k<=end; k++){         
                    currsum+=numbers[k];
                }
                System.out.println(currsum);
                if(maxSum<currsum){
                    maxSum=currsum;
                }
            }
        }

        System.out.println("Max sum = "+ maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16};

        maxsubarrays(numbers);
        }   
}    
