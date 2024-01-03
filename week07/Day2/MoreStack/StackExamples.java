package Day2.MoreStack;

import java.util.Deque;
import java.util.LinkedList;

public class StackExamples {
    public static void main(String[] args) {
        Deque<Integer> stack1 = new LinkedList<>();
        //System.out.println(stack1.pop()); //Exception in thread "main" java.util.NoSuchElementException
        System.out.println(stack1.peek());

        Deque<String> food = new LinkedList<>();
        food.push("canned tuna");
        food.push("steamed rice");
        food.push("tomato soup");
        food.push("egg and bacon croissant");
        food.push("garbanzo beans");
        System.out.println("My pantry has: ");
        prettyPrintStack((LinkedList<String>) food);
    }
    
    public static <E> void prettyPrintStack(LinkedList<E> list) {
        System.out.println("-------------");
        System.out.println("|    TOP    |");
        System.out.println("-------------");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------");
    }
}
