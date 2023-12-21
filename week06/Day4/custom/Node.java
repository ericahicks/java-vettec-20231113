package Day4.custom;

//Node is a Generic class
//E is the type parameter that is provided when an instance of that type is created
public class Node<E> {

    private E value;
    private Node<E> prev;
    private Node<E> next;

    public Node() { }

    public Node(E value, Node<E> prev, Node<E> next) {
        super();
        this.value = value;
        this.prev =  prev;
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node value= " + value;
    }
    
}
