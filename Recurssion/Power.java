public class Power {
    public static int optimizedpower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfpower = optimizedpower(a, n/2);
        int halfpowersq = halfpower * halfpower;

        //n is odd
        if(n%2!=0){
            halfpowersq = a * halfpower * halfpower;
        }

        return halfpowersq;
    }

    public static void main(String[] args) {
        System.out.println(optimizedpower(2, 10));
    }
    
}
