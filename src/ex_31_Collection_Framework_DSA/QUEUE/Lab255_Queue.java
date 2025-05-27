package ex_31_Collection_Framework_DSA.QUEUE;

import java.util.PriorityQueue;

public class Lab255_Queue {
    public static void main(String[] args) {
        // Queue - 0.001% uses in Automation
        PriorityQueue q = new PriorityQueue();
        q.add("vinit");
        q.add("bhosale");
        // natural sorting
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
    }
}
