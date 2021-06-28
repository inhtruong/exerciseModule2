package Example.ArrList;

import java.util.ArrayList;
import java.util.Collections;

public class SortElementOfArrayList {
    public static void main(String[] args) {
        ArrayList<String> listSubject = new ArrayList<>();

        listSubject.add("Math");
        listSubject.add("Chemistry");
        listSubject.add("Physics");
        listSubject.add("Biology");

        System.out.println("Unsorted ArrayList: " + listSubject);
        Collections.sort(listSubject);
        System.out.println("Sorted ArrayList: " + listSubject);
    }
}
