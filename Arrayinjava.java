import java.util.*;

public class Arrayinjava {
    public static int Binarysearch(int numbers[], int key){      //Log n to the base 2 time complexity
        int start = 0,end = numbers.length-1; 

        while(start<=end){
            int mid = (start+ end)/2;
            //comparisons
            if (numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]<key){
                start = mid+1;
            }   else {
                end = mid -1;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,32,14,16};
        int key = 23;
        System.out.println("Index for Key "+key +" is "+ Binarysearch(numbers,key)); 
        }   
}    
