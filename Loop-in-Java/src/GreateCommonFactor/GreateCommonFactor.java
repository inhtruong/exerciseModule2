package GreateCommonFactor;

public class GreateCommonFactor {
    public static void main(String[] args) {
        int a, b;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = input.nextInt();
        System.out.println("Enter the second number: ");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        System.out.println("Greatest common factor: " + a);

    }
}
