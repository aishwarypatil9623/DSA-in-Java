import java.util.*;
public class Javabasics {
    public static void hollow_rectangle(int totRows,int totColumns){
        //outer loop
        for (int i=1; i<= totRows ; i++){
            //inner columns
            for (int j=1; j<= totColumns ; j++){
                // cell - (i,j)
                if(i==1 || i==totRows || j==1 || j==totColumns)
                //boundary cells
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
    public static void inverted_halfpyramid(int totRows,int totColumns){
        for(int i =1;i<=totRows;i++){
            for(int j =1;j<=totColumns-i;j++){
                System.out.print(" ");
            }
            for(int k= 1;k<=i;k++){
                System.out.print("*");
                 
            }
            System.out.println();
        }
    }

    public static void half_pyramidwithnumbers(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }   

    public static void floyed_triangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
 
    public static void zero_onetriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.err.print("0");
                }
            }
            System.out.println();
        }
    }    
    
    public static void butterfly_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.println(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.println(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //int a = sc.nextInt();
   // int b = sc.nextInt();
    hollow_rectangle(4, 4);
    inverted_halfpyramid(4,5);
    half_pyramidwithnumbers(5);
    floyed_triangle(5);
    zero_onetriangle(5);
    butterfly_pattern(5);
    }
}
                           // Functions which are written within classes are called methods
                            //stack overflow --> Errors problems --> Solutionscd