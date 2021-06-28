package Example.LinkList;

import java.util.Deque;
import java.util.LinkedList;

public class DequeRemoveFirstLast {
    public static void main(String[] args) {
        Deque<String> animals= new LinkedList<>();

        // Add elements in LinkedList
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");
        System.out.println("LinkedList: " + animals);

        // Remove the first element from LinkedList
        String str1 = animals.removeFirst();
        System.out.println("Removed Element: " + str1);

        // Remove the last element from LinkedList
        String str2 = animals.removeLast();
        System.out.println("Removed Element: " + str2);

        System.out.println("New LinkedList: " + animals);
    }
}
