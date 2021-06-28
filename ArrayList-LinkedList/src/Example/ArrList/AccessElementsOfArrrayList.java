package Example.ArrList;

import java.util.ArrayList;

public class AccessElementsOfArrrayList {
    public static void main(String[] args) {
        ArrayList<String> listSubject = new ArrayList<>();

        listSubject.add("Math");
        listSubject.add("Chemistry");
        listSubject.add("Physics");
        listSubject.add("Biology");

        // access the element with index 2 of the listSubject
        System.out.println(listSubject.get(2));
    }
}
