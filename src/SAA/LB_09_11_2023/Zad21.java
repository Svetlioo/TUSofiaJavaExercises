package SAA.LB_09_11_2023;

public class Zad21 {
    public static void main(String[] args) {
        int[][] arr = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j > i && arr[i][j] > arr[j][i]) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}

