
public class TillingProblem {
    public static int tilingProblem(int n){   // 2 * n floor size 
        // base case
        if (n==0 || n==1){
            return 1;

        }

        //vertical tiles
        int fnm1 = tilingProblem(n-1);

        //horizontal tiles
        int fnm2  = tilingProblem(n-2);

        int totalways = fnm1 + fnm2;
        return totalways;

    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
