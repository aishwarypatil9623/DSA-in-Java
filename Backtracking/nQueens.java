public class nQueens {
    public static boolean isSafe(char[][] board, int row, int col){
        //Vertically Up 
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diagonally left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q'){
                return false;
            }    
        }

        //Diagonally Right 
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q'){
                return false;
            }    
        }

        return true;
    }

    public static void NQueens(char[][] board, int row){
        //base
        if (row == board.length){
            printBoard(board);
            return;
        }
        //coloumn loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                NQueens(board, row+1); //fuction call // Adding queen to each row by recurssion
                board[row][j] = 'X';  // backtracking // again after backtracing, this implies removing the
            }
        }
    }
    public static void printBoard(char[][] board) {
        System.out.println("-------CHESS BOARD--------");
            for(int i=0; i<board.length; i++){
                for(int j=0; j<board.length; j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {

        int n = 4;
        char board[][]= new char[n][n];
        //initialize 
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        NQueens(board,0);
    }
    
}
