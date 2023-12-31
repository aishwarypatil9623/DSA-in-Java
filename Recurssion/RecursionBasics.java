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

    public static int Fibonaaci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int fibnm1 = Fibonaaci(n-1);
        int fibnm2 = Fibonaaci(n-2);
        int Fib = fibnm1 + fibnm2 ;
        return Fib;
    }
    public static void main(String[] args) {
        int n =4 ;
        printDec(n);
        printInc(n);
        System.out.println(Factorial(n));
        System.out.println(sumoffnn(n));
        System.out.println(Fibonaaci(n));
        
    }
    
}
