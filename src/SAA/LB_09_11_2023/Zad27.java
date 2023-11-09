package SAA.LB_09_11_2023;

public class Zad27 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(arrCalc(arr, 0));
    }

    static int arrCalc(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        } else {
            return arr[index] + arrCalc(arr, index + 1);
        }
    }

}
