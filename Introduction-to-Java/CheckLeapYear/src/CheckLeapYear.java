import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        do {
            System.out.println("Enter a year: ");
            year = input.nextInt();
            boolean check = false;
            if (year % 4 != 0) {
                check = false;
            } else {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        check = true;
                    } else {
                        check = false;
                    }
                } else {
                    check = true;
                }
            }

            if (check) {
                System.out.printf("%d is a leap year", year);
            } else {
                System.out.printf("%d is a NOT leap year", year);
            }
        } while (year != 0);

    }

}
