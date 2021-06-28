package Example.ArrList;

import java.util.ArrayList;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> listSubject = new ArrayList<>();

        listSubject.add("Math");
        listSubject.add("Chemistry");
        listSubject.add("Physics");
        listSubject.add("Biology");

        Object[] arr = listSubject.toArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + "is" + arr[i]);
        }
    }
}
