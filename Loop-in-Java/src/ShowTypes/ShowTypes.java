package ShowTypes;
import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter the choice: ");
            choice = input.nextInt();
            int rows = 5;

            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; i < 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 2:

                    System.out.println("Print the square triangle: botton-left");
                    for (int i = 1; i <= rows; i++) {
                        for (int k = 0; k < i; k++) {
                            System.out.print("* ");
                        }
                        for (int j = rows; j >= i ; j--) {
                            System.out.print("  ");
                        }
                        System.out.print("\n");
                    }

                    System.out.println("Print the square triangle: botton-left");
                    for (int i = 1; i <= rows; i++) {

                        for (int j = 1; j <= rows - i; j++) {
                            System.out.print("* ");
                        }
                        for (int k = 1; k <=rows; k++) {
                            System.out.print(" ");
                        }
                        System.out.print("\n");
                    }

                    System.out.println("Print the square triangle: botton-left");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < i ; j++) {
                            System.out.print("  ");
                        }
                        for (int k = rows; k > i; k--) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }

                    System.out.println("Print the square triangle: botton-left");
                    for (int i = 0; i < rows; i++) {

                        for (int j = rows; j > i ; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k < i; k++) {
                            System.out.print("* ");
                        }

                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i = 0; i < rows; i++) {
                        for (int j = rows; j >= i ; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print(" *");
                        }
                        System.out.print("\n");
                    }
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        } while (true);
    }
}
