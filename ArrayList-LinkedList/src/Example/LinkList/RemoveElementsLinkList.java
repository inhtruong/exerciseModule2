package Example.LinkList;


import java.util.LinkedList;

public class RemoveElementsLinkList {
    public static void main(String[] args) {
        LinkedList<String> listSubject = new LinkedList<>();

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
