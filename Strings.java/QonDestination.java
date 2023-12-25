public class QonDestination {
    public static float shortestpatuh(String str){
        int x = 0;
        int y = 0;
        for(int i =0;i<str.length(); i++){
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String[] args) {
        //String str = "WNEENESENNN";
        String str = "NS";
        System.out.println(shortestpatuh(str));
    }
    
}
