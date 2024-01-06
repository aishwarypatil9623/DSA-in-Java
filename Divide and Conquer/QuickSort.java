public class QuickSort {
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        //last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); //left part
        quickSort(arr, pIdx+1, ei); //right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i =si-1;     //to make place for elements smaller than pivot

        for(int j=si; j<ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j]; 
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }    
        i++;
        //swap
        int temp = pivot; 
        arr[ei] = arr[i];  //pivot = arr[i ]
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {1,9,5,8,4,2,6,7};
        quickSort(arr, 0, arr.length-1);  // O(n**2) worst case time complexity
        printarr(arr);

        
    }
    
}
