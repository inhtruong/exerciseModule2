package Mobile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mobile iphone = new Mobile("IPhone XS", "Black", 256);
        Mobile xiaomi = new Mobile("Redmi K30 5G", "White", 128);

        Scanner scan = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Sent msg from Iphone to Xiaomi");
            System.out.println("2. Sent msg from Xiaomi to Iphone");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Sent messages form Iphone: ");
                    iphone.setMessage(scan.nextLine());
                    System.out.println("Receive messages at Xiaomi: " + iphone.getMessage());
                    break;
                case 2:
                    System.out.println("Sent messages form Iphone: ");
                    xiaomi.setMessage(scan.nextLine());
                    System.out.println("Receive messages at Iphone: " + xiaomi.getMessage());
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
