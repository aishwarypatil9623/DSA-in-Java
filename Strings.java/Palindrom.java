public class Palindrom {
    public static boolean ispalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                //not a palindrome
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str = "Racecar";
        ispalindrome(str);
        String str2 = "dad";
        ispalindrome(str2);
        System.out.println(ispalindrome(str2));
    }
}
