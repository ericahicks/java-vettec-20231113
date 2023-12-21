package Day4.custom;

import java.util.NoSuchElementException;

public class TestLinkedList {
    public static void main(String[] args) {
        Node<String> n = new Node<>();
        System.out.println(n); // prints null

        Node<String> n2 = new Node<>("something", null, null);
        System.out.println(n2);

        n2.setPrev(n); //set the previous pointer of n2 to n
        n.setNext(n2); //set the next pointer of n to n2

        System.out.println(n2);
        System.out.println(n);
        System.out.println("Prev of n2 is " + n2.getPrev());
        System.out.println("Next of n is" + n.getNext());

        LinkedList<String> ll = new LinkedList<>();
        System.out.println(ll);
        System.out.println(ll.size());
        ll.add("stuff");
        System.out.println(ll);
        System.out.println(ll.size());
        ll.add("more stuff");
        System.out.println(ll);
        System.out.println(ll.size());

        //Check the head and tail are as expected
        System.out.println(ll.getHead());
        System.out.println(ll.getTail());

        //Check the head's next field
        System.out.println(ll.getHead().getNext().getNext()); //prints out null
        //Check the tail's prev field 
        System.out.println(ll.getTail().getPrev()); //prints out stuff

        //empty list
        LinkedList<String> list = new LinkedList<>();
        try {
            System.out.println(list.get(0));
        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
        }

        System.out.println(ll.get(0)); //prints stuff
        System.out.println(ll.get(1)); //prints more stuff
//        System.out.println(ll.get(2)); //IndexOutOfBoundsException: index: 2, size: 2

        System.out.println(ll.remove(0));
        System.out.println(ll);
        System.out.println(ll.remove(0));
        System.out.println(ll);
        try {
            System.out.println(ll.remove(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error was " + e.getMessage());
        }

        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        ll.add("e");
        System.out.println(ll);
        System.out.println(ll.remove(4));
        System.out.println(ll);
        System.out.println(ll.remove(1));
        System.out.println(ll);
        System.out.println(ll.remove(1));
        System.out.println(ll);

        System.out.println("=========================");
        LinkedList<String> names = new LinkedList<>();
        names.add("Rod");
        names.add("Steven");
        names.add("Sean");
        names.add("tim");
        names.add("Carlos");

        for(int i = names.size(); i > 0; i--) {
            int r = (int) (Math.random() * names.size());
            System.out.println(names.remove(r));
        }
        System.out.println(names);

        LinkedList<Character> nums = new LinkedList<>();
        try {
            int index = nums.indexOf('1');
            System.out.println(index);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        } 
        nums.add('1');
        nums.add('2');
        nums.add('3');
        nums.add('4');
        nums.add('5');
        System.out.println(nums);
        System.out.println(nums.indexOf('3'));
        System.out.println(nums.indexOf('7')); //returns -1

    }
    
}
