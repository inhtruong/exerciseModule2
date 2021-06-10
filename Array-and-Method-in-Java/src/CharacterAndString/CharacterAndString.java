package CharacterAndString;

import java.util.Scanner;

public class CharacterAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.next();

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                count++;
            }
        }
        if (count != 0) {
            System.out.printf("Number of occurrences of a character in a string: %d", count);
        } else {
            System.out.printf("Character not in string!");
        }
    }
}
