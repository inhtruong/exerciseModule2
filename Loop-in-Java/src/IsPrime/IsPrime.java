package IsPrime;
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        int i = 2;
        boolean check = true;
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();

        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                check = false;
                break;
            }
            i++;
        }

        if (check)
            System.out.println(number + " is a prime.");
        else
            System.out.println(number + " is not a prime.");

    }
}
