package Example.ArrList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        String[] subject = {"Math", "Chemistry", "Physics"};

        System.out.println("Array: ");
        for (String value : subject) {
            System.out.println(value + " ");
        }

        //Create an ArrayList from an array
        ArrayList<String> listSubject = new ArrayList<>(Arrays.asList(subject));
        System.out.println("\nArrayList: " + listSubject);
    }
}
