package Example.LinkList;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePollFunc {
    public static void main(String[] args) {
        Queue<String> animals= new LinkedList<>();

        // Add elements in LinkedList
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");
        System.out.println("LinkedList: " + animals);

        // Returns and removes the first element
        String str = animals.poll();
        System.out.println("Removed Element: " + str);
        System.out.println("New LinkedList: " + animals);
    }
}
