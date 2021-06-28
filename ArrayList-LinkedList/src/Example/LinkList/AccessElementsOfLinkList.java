package Example.LinkList;

import java.util.LinkedList;

public class AccessElementsOfLinkList {
    public static void main(String[] args) {
        LinkedList<String> listSubject = new LinkedList<>();

        listSubject.add("Math");
        listSubject.add("Chemistry");
        listSubject.add("Physics");
        listSubject.add("Biology");

        // access the element with index 2 of the listSubject
        System.out.println(listSubject.get(2));
    }
}
