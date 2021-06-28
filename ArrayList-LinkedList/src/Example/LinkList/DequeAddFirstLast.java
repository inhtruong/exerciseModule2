package Example.LinkList;

import java.util.Deque;
import java.util.LinkedList;

public class DequeAddFirstLast {
    public static void main(String[] args){
        Deque<String> animals = new LinkedList<>();

        // Add element at starting of LinkedList
        animals.addFirst("Cow");
        animals.addFirst("Dog");
        animals.addFirst("Cat");
        System.out.println("LinkedList: " + animals);

        // Add elements at the end of LinkedList
        animals.addLast("Zebra");
        System.out.println("New LinkedList: " + animals);
    }
}
