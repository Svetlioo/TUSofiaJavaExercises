import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 2;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int[] arr2 = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println("Array 2 :");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        ArrayList<Integer> array = new ArrayList<>();
        array.add(3);
        System.out.println(array);
    }
}