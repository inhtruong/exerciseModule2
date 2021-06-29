package FindMaxLengthString;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMaxLengthString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Character> array = new ArrayList<>();
        ArrayList<Character> maxLength = new ArrayList<>();

        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        for (int i = 0; i < str.length() - 1; i++) {
            if (array.size() > 0 && str.charAt(i) > str.charAt(i + 1)) {
                array.contains(str.charAt(i));
                array.clear();
            }

            array.add(str.charAt(i));

            if (array.size() > maxLength.size()) { // Simple statement
                maxLength.clear();
                maxLength.addAll(array);
            }

        }
    }
}
