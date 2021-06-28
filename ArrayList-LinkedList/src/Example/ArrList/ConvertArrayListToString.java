package Example.ArrList;

import java.util.ArrayList;

public class ConvertArrayListToString {
    public static void main(String[] args) {
        ArrayList<String> listSubject = new ArrayList<>();

        listSubject.add("Math");
        listSubject.add("Chemistry");
        listSubject.add("Physics");
        listSubject.add("Biology");

        System.out.println("ArrayList: " + listSubject);

        String str = listSubject.toString();
        System.out.println("String: " + str);
    }
}
