package InsertionSort;

public class InsertionSort {
    public void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int k = i - 1;
            for (; k >= 0 && arr[k] > currentElement; k--) {
                arr[k + 1] = arr[k];
                System.out.println("Di chuyen phan tu: " + arr[k]);
            }

            if (k != i) {
                System.out.println(" Chen phan tu: " + arr[i]
                        + ", tai vi tri: " + k);
                arr[k + 1] = currentElement;
            }

            System.out.println("Vong lap thu " + i);
            display(arr);
        }
    }

    public void display(int[] arr) {
        int i;
        System.out.print("[");

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

    public static void main(String[] args) {
        int[] arr = { 6, 7, 0, 2, 8, 1, 3, 9 };

        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Mang du lieu dau vao: ");
        insertionSort.display(arr);
        System.out.println("-----------------------------");
        insertionSort.insertionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        insertionSort.display(arr);
    }
}
