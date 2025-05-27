package ex_31_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class Lab242_LL {
    public static void main(String[] args) {
        LinkedList<String>animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("cat");
        animals.addFirst("Wolf");
        animals.addLast("Lion");
        System.out.println("LinkedList: " + animals);

        //Accessing elements
        System.out.println("First element: " + animals.getFirst());
        System.out.println("First element: " + animals.getLast());
        System.out.println("First element: " + animals.size());
    }
}
