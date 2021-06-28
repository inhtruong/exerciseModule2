package Example.LinkList;


import java.util.LinkedList;

public class AddRemoveAllOfLinkList {
    public static void main(String[] args) {
        LinkedList<String> listSubject = new LinkedList<>();

        listSubject.add("Math");
        listSubject.add("Chemistry");
        listSubject.add("Physics");
        listSubject.add("Biology");

        //add the elements of listSubject to listA
        System.out.println("Example using addAll() method");

        LinkedList<String> listA = new LinkedList<>();

        listA.addAll(listSubject);

        System.out.println("List A: ");
        System.out.println(listA);

        //remove the elements not in listB from listA
        System.out.println("Example using retainAll() method");

        LinkedList<String> listB = new LinkedList<>();
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
