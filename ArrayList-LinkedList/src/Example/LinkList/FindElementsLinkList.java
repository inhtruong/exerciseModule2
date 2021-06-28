package Example.LinkList;


import java.util.LinkedList;

public class FindElementsLinkList {
    public static void main(String[] args) {
        LinkedList<String> listSubject = new LinkedList<>();

        listSubject.add("Math");
        listSubject.add("Chemistry");
        listSubject.add("Physics");
        listSubject.add("Biology");

        // Find element by value
        System.out.println(listSubject.contains("Physics"));
        System.out.println(listSubject.contains("PHP"));

        //Find the position that appears first
        System.out.println(listSubject.indexOf("Math"));
        System.out.println(listSubject.contains("Physics"));

        //Find the position that appears last
        System.out.println(listSubject.indexOf("Biology"));
        System.out.println(listSubject.contains("Physics"));
    }
}
