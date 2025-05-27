package ex_31_Collection_Framework_DSA.LIST;

import java.util.LinkedList;
import java.util.List;

public class Lab241_LinkedList {
    public static void main(String[] args) {

        List list = new LinkedList();// No concept of initial capacity
        list.add("a");
        list.add("b");
        list.add("c");// Location can be anywhere in this case of LikedList
    }
}
