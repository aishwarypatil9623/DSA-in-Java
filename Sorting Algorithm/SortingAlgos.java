import java.util.*;

public class SortingAlgos {                        // time complexity is O(n-square)
    public static void bubblesort(int arr[]){
        for(int turn=0; turn<arr.length-1;turn++){
            for(int j=0; j<arr.length-j-turn; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];    
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printarr(int arr[]) {
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }

    public static void selectionsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp = arr [minPos];
            arr[minPos]=arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,6,2,1,9,10};
        //bubblesort(arr);
        selectionsort(arr);
        printarr(arr);
    }
}