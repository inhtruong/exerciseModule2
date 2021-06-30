package SelectionSort;

public class SelectionSort {
    static double[] list = {1.0, 9.0, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        for(int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            System.out.println("Vong lap thu " + (i + 1));
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            System.out.printf("Min number: %.1f, at position %d \n",currentMin,currentMinIndex);
            if (currentMinIndex != i) {
                System.out.println(" ==> Trao doi phan tu: [ number i = " + list[i]
                        + ", min number index = " + list[currentMinIndex] + "]");
                System.out.println("===============================");
                double temp = list[currentMinIndex];
                list[currentMinIndex] = list[i];
                list[i] = temp;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println();
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
