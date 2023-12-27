public class getsetclearithbit{
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            return 0;    
        } else{
            return 1;
        }
    }

    public static int setIthBit(int n,int i){
        int bitMask = i<<i;
        return n|bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n& bitMask;
    }
    
    public static int UpdateIthBit(int n,int i,int newBit){
        if (newBit==0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }

    public static int clearlastIthBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearrangebit(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerofTwo(int n){
        return (n&(n-1)) == 0; 
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1)!=0){ //check our LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 2));
        System.out.println(UpdateIthBit(10,2,0));
        System.out.println(clearlastIthBits(10, 2));
        System.out.println(clearrangebit(10, 2, 7));
        System.out.println(isPowerofTwo(16));
        System.out.println(countSetBits(15));

    }
}