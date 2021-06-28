package Example.ArrList;

import java.util.ArrayList;

public class FindElementArrayList {
    public static void main(String[] args) {
        ArrayList<String> listSubject = new ArrayList<>();

        listSubject.add("Math");
        listSubject.add("Chemistry");
        listSubject.add("Physics");
        listSubject.add("Biology");

        // Find element by value
        System.out.println(listSubject.contains("Physics"));
        System.out.println(listSubject.contains("PHP"));

        //Find the position that appears first
        System.out.println(listSubject.indexOf("Math"));
        System.out.println(listSubject.indexOf("Physics"));

        //Find the position that appears last
        System.out.println(listSubject.lastIndexOf("Biology"));
        System.out.println(listSubject.lastIndexOf("Physics"));
    }
}
