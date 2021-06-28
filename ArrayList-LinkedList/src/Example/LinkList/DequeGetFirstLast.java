package Example.LinkList;

import java.util.Deque;
import java.util.LinkedList;

public class DequeGetFirstLast {
    public static void main(String[] args) {

        Deque<String> animals= new LinkedList<>();

        // Add elements in the linked list
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");
        System.out.println("LinkedList: " + animals);

        // Get the first element from the linked list
        String str1 = animals.getFirst();
        System.out.println("First Element: " + str1);

        // Get the last element from the linked list
        String str2 = animals.getLast();
        System.out.println("Last Element: " + str2);

    }
}
