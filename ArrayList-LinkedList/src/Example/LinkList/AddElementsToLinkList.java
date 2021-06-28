package Example.LinkList;


import java.util.LinkedList;
import java.util.ListIterator;

public class AddElementsToLinkList {
    public static void main(String[] args) {
        LinkedList<String> listSubject = new LinkedList<>();

        // Add elements to LinkedList
        listSubject.add("Math");

        // Add elements using indexes
        listSubject.add(3,"Chemistry");

        //Creating an object of ListIterator
        ListIterator<String> listAdd = listSubject.listIterator();
        listAdd.add("Physics");
        listAdd.add("Biology");

        System.out.println("Element in the LinkList: " + listSubject);

    }
}
