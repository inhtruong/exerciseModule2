package ReverseElementsOfArray;
import java.util.Scanner;

public class ReverseElementsOfArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scan = new Scanner(System.in);

        // test size of an array
        do {
            System.out.print("Enter a size:");
            size = scan.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        // add element to array
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter elements %d: ",(i + 1));
            array[i] = scan.nextInt();
        }

        //print array
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("\n");

        //reverse array
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
