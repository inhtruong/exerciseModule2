package Example.LinkList;


import java.util.LinkedList;
import java.util.ListIterator;

public class UpdateValueOfElement {
    public static void main(String[] args) {
        LinkedList<String> listSubject = new LinkedList<>();

        listSubject.add("Math");
        listSubject.add("Chemistry");
        listSubject.add("Physics");
        listSubject.add("Biology");

        System.out.println("After: ");
        System.out.println(listSubject);

        // update value for element with index 3
        listSubject.set(2,"English");
        System.out.println("Before: ");
        System.out.println(listSubject);

        // Creating an object of ListIterator. Change element returned by next()
        ListIterator<String> listIterator = listSubject.listIterator();
        listIterator.next();
        listIterator.set("Literature");
        System.out.println("New List: " + listSubject);
    }
}
