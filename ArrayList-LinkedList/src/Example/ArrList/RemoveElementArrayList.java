package Example.ArrList;

import java.util.ArrayList;

public class RemoveElementArrayList {
    public static void main(String[] args) {
        ArrayList<String> listSubject = new ArrayList<>();

        listSubject.add("Math");
        listSubject.add("Chemistry");
        listSubject.add("Physics");
        listSubject.add("Biology");

        System.out.println("Number of elements of the original list" + listSubject.size());
        System.out.println("Elements of the original list" + listSubject);

        // Remove element with index = 1
        listSubject.remove(1);
        System.out.println("Number of elements of the list after remove" + listSubject.size());
        System.out.println("Elements of the original list after remove" + listSubject);

        // Remove element with name
        listSubject.remove("Math");
        System.out.println("Number of elements of the list after remove" + listSubject.size());
        System.out.println("Elements of the original list after remove" + listSubject);

        // Remove all element
        listSubject.clear();
        System.out.println("Number of elements of the list after clear" + listSubject.size());
        System.out.println("Elements of the original list after clear" + listSubject);

    }
}
