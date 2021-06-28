package Example.ArrList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DisplayElementsInArrayList {
    public static void main(String[] args) {
        ArrayList<String> listSubject = new ArrayList<>();

        // add elements to ArrayList by function add
        listSubject.add(0,"Math");
        listSubject.add(1,"Chemistry");
        listSubject.add(1,"Physics");
        listSubject.add(3, "biology");


        //Display the elements in the ArrayList
        System.out.println("Elements in the ArrayList: ");
        System.out.println(listSubject);

        listSubject.add(1, "English");

        System.out.println("New Elements in the ArrayList: ");
        System.out.println(listSubject);

//        //Browse the elements of an ArrayList by loop for
//        System.out.println("Elements in the ArrayList: ");
//
//        for (int i = 0; i < listSubject.size(); i++) {
//            System.out.println(listSubject.get(i));
//        }
//
//        //Browse the elements of an ArrayList by loop forEach
//        System.out.println("Elements in the ArrayList: ");
//
//        for (String str : listSubject) {
//            System.out.println(str);
//        }
//
//        //Browse the elements of an ArrayList by Iterator
//        Iterator<String> iterator = listSubject.iterator();
//        System.out.println("Elements in the ArrayList: ");
//
//        while (iterator.hasNext()) {
//            System.out.println((String) iterator.next());
//        }
//
//        //Browse the elements of an ArrayList by ListIterator
//        ListIterator<String> listIterator = listSubject.listIterator();
//        System.out.println("Elements in the ArrayList: ");
//
//        while (listIterator.hasNext()) {
//            System.out.println((String) listIterator.next());
//        }

    }
}
