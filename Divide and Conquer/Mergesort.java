public class Mergesort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void MergeSort(int arr[], int si,int ei){ //starting Index and ending Index
        if(si>=ei){
            return;
        }
        //kaam
        int mid = si + (ei - si)/2;  //(si+ei)/2
        MergeSort(arr,si,mid); // left part
        MergeSort(arr,mid+1,ei); // Right part
        Merge(arr,si,mid,ei);
    }

    public static void Merge(int arr[], int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;  //iterator for left part
        int j = mid+1; //iterator for the right part
        int k = 0;    //iterator for temp arr

        while(i <= mid && j <= ei){
            if(arr[i]<arr[j]){
                temp[k]= arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left part 
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        //right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        //copying temp to Original arr
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,-6,5,2,8};
        MergeSort(arr,0, arr.length-1);
        printarr(arr);
        
    }
    
}
