package Example.LinkList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DisplayElementsInLinkList {
    public static void main(String[] args) {
        LinkedList<String> listSubject = new LinkedList<String>();

        // add elements to ArrayList by function add
        listSubject.add("Math");
        listSubject.add("Chemistry");
        listSubject.add("Physics");
        listSubject.add(3,"Biology");

        // Display the elements in the ArrayList
        System.out.println("Elements in the List: ");
        System.out.println(listSubject);

        //Browse the elements of an ArrayList by loop for
        System.out.println("Elements in the List: ");
        for (int i = 0; i < listSubject.size(); i++) {
            System.out.println(listSubject.get(i));
        }

        //Browse the elements of an ArrayList by loop forEach
        System.out.println("Element in the List: ");
        for (String value : listSubject) {
            System.out.println(value);
        }

        // Browse the elements of an ArrayList by Iterator
        Iterator<String> iterator = listSubject.iterator();
        System.out.println("Element in the list: ");
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }

        //Browse the elements of an ArrayList by listIterator
        ListIterator<String> listIterator = listSubject.listIterator();
        System.out.println("Element in the list: ");
        while (listIterator.hasNext()) {
            System.out.println((String) listIterator.next());
        }


    }
}
