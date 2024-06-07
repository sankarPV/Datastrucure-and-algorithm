package DSAlgo.revision1;

import java.util.Stack;

//reverse word in a string
public class ReverseWordInStringUsingStack {
    public static void main(String args[]) {
        String str = "I am preparing for Microsoft Interview";

        Stack<String> stack = new Stack<>();
        String[] strs = str.split(" ");

        //push the string into Stack
        for(String string: strs) {
            stack.push(string);
        }

        //pop the string from the Stack
        StringBuffer ans = new StringBuffer();
        while(stack.size() != 0) {
            ans.append(stack.pop() + " ");
        }

        System.out.println(ans.toString());
    }
}