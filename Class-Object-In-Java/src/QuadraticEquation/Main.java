package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        QuadraticEquation quadratic = new QuadraticEquation();
        System.out.println("Enter a: ");
        quadratic.setA(input.nextDouble());
        System.out.println("Enter b: ");
        quadratic.setB(input.nextDouble());
        System.out.println("Enter c: ");
        quadratic.setC(input.nextDouble());

        if (quadratic.getDiscriminant() > 0) {
            System.out.printf("\nThe equation has two roots: %.4f and %.4f",
                                quadratic.getRoot1(), quadratic.getRoot2());
        } else if (quadratic.getDiscriminant() == 0) {
            System.out.printf("\nThe equation has one roots: %.4f", quadratic.getRoot1());
        } else {
            System.out.println("\nThe equation has one roots");
        }
    }


}
