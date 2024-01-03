package Day1.StackPractice;

public class MyStack<T> {
    
    //this node refer to whatever the top of the stack currently is 
    private Node<T> top;
    //this will refer to the current size of our stack (how many elemenst are in it)
    private int size;

    public MyStack() { }

    /*
     * Push will take an item of type T and place it on the top of the stack
     * any other items are going to be below this new item
     */
    public void push(T item) {
            if(item == null) {
                throw new IllegalArgumentException("No null entries allowed!");
            }
            if(top == null) {
                //creates a new ned node that holds the value of the item we're trying to add
                Node<T> newTop = new Node<T>(item);
                top = newTop;
                size++;
                return;
            }
            Node<T> newTop = new Node<T>(item);
            newTop.setNext(top); //this says that this node now points to the top
            top = newTop; //this updates our stack to refer tot the new top created
            size++; //add 1 size because we just added an element
    }

    /*
     * Pop will take NO prarameters, but "pop" will remove the top element in the stack and return its value
     * if the stack is currently, it will throw an exception
     */
    public T pop() {
        if(top == null) {
            throw new IllegalArgumentException("Can NOT pop empty stack!");
        }
        Node<T> oldTop = top; //temporary varaible to hold pour oldTop's data
        top = top.getNext(); //setting the stacks top to be the next in line
        size--;
        return oldTop.getValue(); //returns the value of the top element
    }

    /*
     * Peek is similar to pop, but will "peek" at the top of the element in the stack, WITHOUT removing the element, and return its value
     * if the stack is currently empty, this DOES NOT throw am exception, rather returns null
     */
    public T peek() {
        if(isEmpty()) {
            // could also return an exception here
            return null; //stack is empty so return null
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        //return size == 0; // another way of writing it

        if(size == 0) {
            return true;
        } else {
            return false;
        }   
    }

    //Returns the current size of the stack
    public int size() {
        return this.size;
    }

    //Continuously adds the values to one big string and then returns it for printing purposes
    @Override
    public String toString() {
        String str = "[";
        Node<T> currNode = top; //starting with the top go through and print the whole stack without removing anything
        while(currNode != null) {
            str += currNode.getValue(); //add the value stored in that node to our string

            //if there's no next, that means it's the final element in our stack, so no comma
            if(currNode.hasNext()) { 
                //if there's a next node in the sequence, add a coma
                str += ",";
            }

            //Advance our pointer
            currNode = currNode.getNext(); //it changes out pointer from one node to that node's neghbooring node
        }
        str += "]";
        return str;
    }


    public static void main(String[] args) {
        MyStack<String> names = new MyStack<>();
        names.push("Rod");
        System.out.println(names.peek());
        names.push("Josh");
        names.push("Hunter");
        System.out.println(names.peek());

        System.out.println(names);
        names.pop();
        System.out.println(names);

        names.push("Caroline");
        names.push("Sam");
        System.out.println(names);
        names.pop();
        names.pop();
        System.out.println(names.peek());
        System.out.println(names);

        /*
         * Common use cases of stacks (Where do you see them in everyday life?)
         * 
         * - Undo button on word document
         * - Browsers page history 
         *      - forward arrow will take us to the deepest page in the stack (the top)
         *      - backwards arrow, will pop everything above it off the stack and add the new page onto the stack
         */

    }
}
