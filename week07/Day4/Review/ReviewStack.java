package Day4.Review;

import java.util.Stack;

public class ReviewStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); 
        stack.push(5);
        stack.push(4);
        stack.push(1);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
    
}
