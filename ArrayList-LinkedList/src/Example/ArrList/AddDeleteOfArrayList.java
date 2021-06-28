package Example.ArrList;

import java.util.ArrayList;

public class AddDeleteOfArrayList {
    public static void main(String[] args) {
        ArrayList<String> listSubject = new ArrayList<>();

        listSubject.add("Math");
        listSubject.add("Chemistry");
        listSubject.add("Physics");
        listSubject.add("Biology");

        //add the elements of listSubject to listA
        System.out.println("Example using addAll() method");

        ArrayList<String> listA = new ArrayList<>();

        listA.addAll(listSubject);

        System.out.println("List A: ");
        System.out.println(listA);

        //remove the elements not in listB from listA
        System.out.println("Example using retainAll() method");

        ArrayList<String> listB = new ArrayList<>();
        listB.add("Math");

        listA.retainAll(listB);

        System.out.println("List A: ");
        System.out.println(listA);

        //delete the elements in listB from listSubject
        System.out.println("Example using removeAll() method");

        listSubject.removeAll(listB);

        System.out.println("List Subject: ");
        System.out.println(listSubject);

    }
}
