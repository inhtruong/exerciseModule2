import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        float amount, rate, result = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amount you want to convert (USD): ");
        amount = input.nextFloat();
        rate = 23000;
        if (amount > 0) {
            result = amount * rate;
        }

        System.out.printf("%-15s%s\n", "Tiền USD", "Tiền VND");
        System.out.printf("%-15.0f%.0f", amount, result);
    }
}
