package AddElementToArray;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //khai bao va khoi tao
        int size;
        int[] array;

        System.out.print("Enter a size: ");
        size = scan.nextInt();

        array = new int[size];

        //add element
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter elements %d: ",(i + 1));
            array[i] = scan.nextInt();
        }

        //Print the Array
        System.out.println("Print the Array: ");
        for (int value : array) {
            System.out.printf("%d\t", value);
        }

        System.out.println();
        // Number to insert
        System.out.print("Number to insert: ");
        int X = scan.nextInt();


        //Enter the position to insert X into the Array
        System.out.print("Enter the index position to insert X into the Array: ");
        int index = scan.nextInt();

        //No insert into in start and end of Array
        if(index<=1 && index >=array.length-1) {
            System.out.println("Unable to insert element into array!");
        } else {
            // Insert
            for (int i = 0; i < array.length - 1; i++) {
                if (index == i) {
                    for (int j = 0; j < array.length - i; j++) {
                        array[array.length-1-j] =array[array.length-2-j];
                    }
                    array[index] = X;
                }
            }
        }
        System.out.println("Print the Array: ");
        for (int value : array) {
            System.out.printf("%d\t", value);
        }
    }
}
