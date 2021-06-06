package InterestCalculator;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Money: ");
        double money = input.nextDouble();

        System.out.println("Time (month): ");
        int month = input.nextInt();

        System.out.println("Interest rate: ");
        double rate = input.nextDouble();

        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (rate / 100) / 12 * month;
        }
        System.out.printf("%-20s%-20s%-20s%s\n", "Money", "Time (month)", "Interest rate", "Total interset");
        System.out.printf("%-20.2f%-20d%-20.2f%-20.5f", money, month, rate, total);
    }
}
