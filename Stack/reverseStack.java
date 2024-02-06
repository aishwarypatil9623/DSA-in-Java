import java.util.*;

public class reverseStack {
    public static void pushatBottom( Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);  //adding our data when all the elements have been came out
            return;
        }
        int top = s.pop();
        pushatBottom(s, data); //recursion
        s.push(top);
    }    

    public static void ReverseStack(Stack<Integer> s){
        if(s.isEmpty()) {
             return;   //since empty stack is always a reverse stack 
        }
        int top = s.pop();
        ReverseStack(s);
        pushatBottom(s, top); // fyfyufufh
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3,2,1
        ReverseStack(s);
        printStack(s);
        //1,2,3
    }
}
