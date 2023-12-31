public class GridWay {
    public static int gridways(int i,int j, int n, int m){
        //base case
        if(i == n-1 && j == m-1) {   //condition for last cell 
            return 1;
        }else if(i == n || j == n){   //boundary condition
            return 0;
        }
        //kaam
        int w1 = gridways(i+1, j, m, n);
        int w2 = gridways(i, j+1, m, n);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n = 4, m = 4;
        System.out.println(gridways(0, 0, n, m));
    }
}
