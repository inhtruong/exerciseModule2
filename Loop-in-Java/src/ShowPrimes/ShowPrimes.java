package ShowPrimes;
import java.util.Scanner;

public class ShowPrimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of primes: ");
        int numbers = scan.nextInt();
        int count = 0;
        int N = 2;

        while (count <= numbers) {
            boolean check = true;
            for (int i = 2; i < Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.print(N + " - ");
                count++;
            }
            N++;
        }
    }
}
