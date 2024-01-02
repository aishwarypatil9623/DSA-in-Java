public class RecursionBasics {
    public static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        //int fnm1 = Factorial(n-1);
        int fn = n * Factorial(n-1);
        return fn;
    }

    public static int sumoffnn(int n){   //sum of First n Natural Numbers
        if(n== 1){
            return 1;
        }
        int Snm1 = sumoffnn(n-1);    //sum of first n-1 natural numbers
        int sum = n + Snm1;
        return sum;
    }

    public static int Fibonaaci(int n){ // nth term of  a fibonacci Series
        if(n==0 || n==1){
            return n;
        }
        int fibnm1 = Fibonaaci(n-1);
        int fibnm2 = Fibonaaci(n-2);
        int Fib = fibnm1 + fibnm2 ;
        return Fib;
    }

    public static boolean isSorted(int arr[], int i){ // checks whether the array is sorted or not 
        if(i == arr.length - 1){          //i = it is the place from where we have to check the sorted array
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static int firstocc(int arr[],int key,int i){   //tells us the postion of occurance of the n key in the array
        if(i == arr.length){          //i = it is the place from where we have to check the sorted array
            return -1;
        }
        
        if(arr[i] == key){
            return i;
        }
        
        return firstocc(arr, key, i+1);
    }

    public static int lastocc(int arr[],int key,int i){   //tells us the postion of occurance of the n key in the array
        if(i == arr.length){          //i = it is the place from where we have to check the sorted array
            return -1;
        }

        int isFound = lastocc(arr, key, i+1);
        if (isFound != -1){
            return isFound;
        }

        //check with self
        if(arr[i] == key){
            return i;
        }
        
        return isFound;
    }

    public static int lastocc2(int arr[],int key,int i){
        if(i == arr.length){          //i = it is the place from where we have to check the sorted array
            return -1;
        }
        int isFound = lastocc(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;

    }

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        //or 

        return x * power(x, n-1);
    }

    public static void main(String[] args) {
        int n =4 ;
        int arr[] = {1,2,3,4,4,3,6,6,4};
        printDec(n);
        printInc(n);
        System.out.println(Factorial(n));
        System.out.println(sumoffnn(n));
        System.out.println(Fibonaaci(n));
        System.out.println(isSorted(arr, 1));
        System.out.println(firstocc(arr, n, 0));
        System.out.println(lastocc(arr, n, 0));
        System.out.println(power(5, n));
    }
    
}
