import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();

        if (a != 0) {
            double solution = (b - c) / a;
            System.out.printf("The solution is x: %.2f!", solution);
        } else {
            if ( b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}