import java.util.*;

public class Diagonalsum{
    public static int diagonalsum(int matrix[][]){
        int sum=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=matrix[0].length;j++){
                if(i==j){
                    sum += matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }
    public static int diagonalsum2(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            //pd
            sum += matrix[i][i];
            //sd
            sum += matrix[i][matrix.length-i-1];
        }

        return sum;
    }
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0,col = matrix[0].length-1;

        while (row<matrix.length && col >= 0) {
            if(matrix[row][col]==key){
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not Found!");
        return false;
    }

    public static void main(String[] args){
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key =33;
        staircaseSearch(matrix, key);                 
    //System.out.println(diagonalsum(matrix));
    // System.out.println(diagonalsum2(matrix));
    }
}