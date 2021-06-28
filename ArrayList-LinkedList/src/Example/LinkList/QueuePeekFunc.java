package Example.LinkList;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePeekFunc {
    public static void main(String[] args) {
        Queue<String> animals= new LinkedList<>();

        // Add elements in LinkedList
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");
        System.out.println("LinkedList: " + animals);

        // Access the first element of LinkedList
        String str = animals.peek();
        System.out.println("Element Accessed: " + str);
        System.out.println("New LinkedList: " + animals);
    }
}
