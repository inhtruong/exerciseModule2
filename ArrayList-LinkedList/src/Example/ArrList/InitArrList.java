package Example.ArrList;

import java.util.ArrayList;
import java.util.Arrays;

public class InitArrList {
    public static void main(String[] args) {
        // init Arraylist name listStr_0 and type String
        ArrayList<String> listStr_0 = new ArrayList<>();

        // init Arraylist name listStr_1 type String and 20 elements
        ArrayList<String> listStr_1 = new ArrayList<>(20);

        // int ArrayList by use asList() method
        ArrayList<String> listStr_2 = new ArrayList<>(Arrays.asList("Math", "Physics", "Chemistry"));

    }
}
