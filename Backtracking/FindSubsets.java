public class FindSubsets{
    public static void findsubsets(String str, String ans, int i){
        //base case 
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            } else{
                System.out.println(ans);
            }
            return;
        }

        //Yes Choices
        findsubsets(str, ans+str.charAt(i), i+1);
        //No Choices
        findsubsets(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        findsubsets(str, "", 0);      // time Complexity is o(2**n * n)
        
    }
}