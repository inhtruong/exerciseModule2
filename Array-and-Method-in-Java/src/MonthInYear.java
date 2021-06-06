public class MonthInYear {
    public static void main(String[] args) {
        isPrint();
    }

    public static int[] isPrint() {
        int monthArr[] = new int[12];

        for (int i = 0; i < monthArr.length; i++) {
            monthArr[i] = i + 1;
            System.out.println("Month " + (i + 1));
        }
        return monthArr;
    }
}
