package Example.LinkList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOfferFunc {
    public static void main(String[] args) {
        Queue<String> animals= new LinkedList<>();

        // Add elements in LinkedList
        animals.add("Dog");
        animals.add("Horse");
        System.out.println("LinkedList: " + animals);

        // Adds element at the end of LinkedList
        animals.offer("Cat");
        System.out.println("New LinkedList: " + animals);
    }
}
