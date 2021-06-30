package BubbleSort;

import javax.imageio.stream.ImageInputStream;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            /* Array may be sorted and next pass not needed */
            needNextPass = false;
            System.out.println("Lần lặp: " + k);
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.print("So sanh cac phan tu: [" + list[i] + ", " + list[i + 1] + "]");
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    if (needNextPass = true) {
                        /* Next pass still needed */
                        System.out.print(" Swap " + list[i] + " with " + list[i + 1] + "\t");
                    } else {
                        System.out.println("No Swap");
                    }

                }
            }
            System.out.println("\n");
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
