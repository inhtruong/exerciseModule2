package MergeArray;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size_1;
        int size_2;
        int[] array_1;
        int[] array_2;
        int[] mergeArray;

        System.out.print("Enter the size of Array: ");
        size_1 = scan.nextInt();

        array_1 = new int[size_1];
        System.out.println("Add elements to Array 1: ");
        for (int i = 0; i < array_1.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array_1[i] = scan.nextInt();
        }

        System.out.print("Enter the size of Array: ");
        size_2 = scan.nextInt();

        array_2 = new int[size_2];
        System.out.println("Add elements to Array 2: ");
        for (int j = 0; j < array_2.length; j++) {
            System.out.print("Enter element " + (j + 1) + ": ");
            array_2[j] = scan.nextInt();
        }

        System.out.print("Print the Array 1: ");
        Show(array_1);

        System.out.print("Print the Array 2: ");
        Show(array_2);

        mergeArray = new int[size_1 + size_2];

        for (int i = 0; i < array_1.length; i++) {
            mergeArray[i] = array_1[i];
        }
        for (int i = 0; i < array_2.length; i++) {
            if (array_1.length > array_2.length) {
                mergeArray[mergeArray.length - array_1.length + i + 2] = array_2[i];
            } else if (array_1.length < array_2.length) {
                mergeArray[mergeArray.length - array_1.length + i - 2] = array_2[i];
            } else {
                mergeArray[mergeArray.length - array_1.length + i] = array_2[i];
            }
        }

        System.out.print("Print the Merge Array: ");
        Show(mergeArray);

    }

    public static void Show(int[] arr) {
        for (int value : arr) {
            System.out.printf("%d\t", value);
        }
        System.out.println();
    }
}
