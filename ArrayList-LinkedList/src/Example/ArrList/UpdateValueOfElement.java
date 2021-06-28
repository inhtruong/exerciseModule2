package Example.ArrList;

import java.util.ArrayList;

public class UpdateValueOfElement {
    public static void main(String[] args) {
        ArrayList<String> listSubject = new ArrayList<>();

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
    }
}
