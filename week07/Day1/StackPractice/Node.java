package Day1.StackPractice;

//the generic is used to store data passed onto the stack
public class Node<T> {

    //the data being stored in the node
    private T value;

    //the node that is next in chain. If null, then there's no next in the chain
    private Node<T> next;

    //we call this constructor whenever we want to create a new node that doesnt point to anything
    public Node(T value) {
        this.value = value;
    }

    //we'll call this constructor whenever we want to create a new node that points to another node
    public Node(T value, Node<T> next ) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public boolean hasNext() {
        //if the element is null, that means that there's no next element in line
        return this.next != null;
    }

}