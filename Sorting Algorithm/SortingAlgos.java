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
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]<arr[j]){    //if we use arr[minPos]<arr[j]  it will give us the decreasing order
                    minPos=j;
                }
            }
            //swap
            int temp = arr [minPos];
            arr[minPos]=arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionsort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct position to insert
            while(prev>=0 && arr[prev]> curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i=0;i<arr.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,6,2,1,5,5,2,3,9};
        //bubblesort(arr);
       // selectionsort(arr);
       //insertionsort(arr); 
       countingsort(arr);
       printarr(arr);
    }
}