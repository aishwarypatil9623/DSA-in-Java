public class Oddoreven {
    public static void oddeven(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            //even Numbers
            System.out.println("even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddeven(3);
        oddeven(4);
        oddeven(7);
    }
    
}
