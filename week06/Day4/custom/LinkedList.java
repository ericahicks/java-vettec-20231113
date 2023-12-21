package Day4.custom;

import java.util.NoSuchElementException;

public class LinkedList<E> {

    private Node<E> head;
    private Node<E> tail;

    private int size;

    public LinkedList() { }

    public int size() {
        return size;
    }


    public void add(E e) {
        //check size of list
        if(size == 0) {
            head = new Node<E>(e, null, null);
            tail = head;
            size++;
        } else {
            //append to end of list
            Node<E> n = new Node<E>(e, null, null);
            Node<E> oldTail = tail;
            //update the tail
            tail = n;
            //update the tail's prev
            n.setPrev(oldTail);
            //update the oldTails next
            oldTail.setNext(n);
            size++;
        }
    }

    public E get(int index) {
        //check if index is valid
        if(index < 0 || index > size -1)
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        Node<E> n = head;

        for(int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n.getValue();
    }

    public E remove(int index) {
        if(index < 0 || index > size - 1) 
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        Node<E> n = head;
        //case where there is 1 element 
        if(size == 1) {
            n = head;
            head = null;
            tail = null;
        }
        //case where there is the last element
        else if (index == size - 1) {
            n = tail;
            tail.getPrev().setNext(null);
            tail = tail.getPrev();
        }
        //case where index is the first element
        else if (index == 0){
            n = head;
            head.getNext().setPrev(null);
            head = head.getNext();
        } else {
            //case where index is a middle element
            n = head;
            for(int i = 0; i < index; i++) {
                n = n.getNext();
            }
            //sets the prev's to the next next 
            n.getPrev().setNext(n.getNext());
            //sets the next prev to the prev
            n.getNext().setPrev(n.getPrev());
        }
        size--;
        return n.getValue();

    }

    //Returns the index first occurence, if not found returns -1
    public int indexOf(E e) {
        //if the list is empty throw an exception
        if(size == 0) {
            throw new NoSuchElementException("List is empty");
        }
        Node<E> n = head;
        for(int i = 0; i < size; i++) {
            //compare n.value and e
            if(e == null && n.getValue() == null) {
                return i;
            } else if (e.equals(n.getValue())) {
                return i;
            } else {
                n = n.getNext();
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String values = "[";
        //null check
        if(head == null) {
            values += "]";
        } else {
            //iterate through the nodes and get the values until find a node with next == null (end of list)
            Node<E> n = head;
            while(n != null) {
                //get the values
                values += n.getValue();
                //update n
                n = n.getNext();
                if(n != null) {
                    values += ", ";
                }
            }
            values += "]";
        }
        return values;
    }

    Node<E> getHead() {
        return head;
    }

    Node<E> getTail() {
        return tail;
    }
     
}
