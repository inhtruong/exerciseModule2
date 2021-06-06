package DeleteElementOfArray;

import java.util.Objects;
import java.util.Scanner;

public class DeleteElementOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Khai bao va khoi tao array integer
        int size;
        int[] array;

        System.out.print("Enter a size: ");
        size = scan.nextInt();

        array = new int[size];

        // add element
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter elements %d: ", (i + 1));
            array[i] = scan.nextInt();
        }

        // Print the Array
        System.out.print("Print the Array:");
        for (int value : array) {
            System.out.printf("%d\t", value);
        }
        System.out.println();

        // Enter X as the element to delete
        System.out.print("Enter X as the element to delete: ");
        int X = scan.nextInt();

        // Find X in Array
        boolean isExist = false;
        int index_del = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index_del = i + 1;
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + X + " in the list.");
        } else {

            // Delete Element
            for (int i = 0; i < array.length; i++) {
                for (int j = index_del - 1; j < array.length - 1; j++) {
                    if (array[j] == X) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
                if (array[i] == X) {
                    array[i] = 0;
                }
//                array[array.length - 1 - i] = 0;
            }
        }

        System.out.print("Print the Array:");
        for (int value : array) {
            System.out.printf("%d\t", value);
        }
    }
}
