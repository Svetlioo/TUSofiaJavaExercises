package L.U10_10_2023;

import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("Stop")) {
            switch (input) {
                case "Sums" -> Sums();
                case "Reverse" -> ReverseArray();
                case "Prosto Chislo" -> {
                    System.out.println("Enter num: ");
                    int n = Integer.parseInt(sc.nextLine());
                    System.out.println(ProstoChislo(n));
                }
                case "minMax" -> {
                    minMax();
                }
                case "Matrix" -> {
                    Matrix();
                }
                case "Zvezdichki" -> {
                    System.out.println("Enter num: ");
                    int n = Integer.parseInt(sc.nextLine());
                    Zvezdichki(n);
                }
            }
            input = sc.nextLine();
        }
    }

    public static void Sums() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        int sumOdd = 0;
        int sumEven = 0;
        for (int el : arr) {
            sum += el;
            if (el % 2 == 0) {
                sumEven += el;
            } else {
                sumOdd += el;
            }
        }
        System.out.printf("Sum : %d%nEven sum: %d%nOdd sum: %d%n", sum, sumEven, sumOdd);
    }

    public static void ReverseArray() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reversedArray = new int[arr.length];
        for (int i = arr.length; i > 0; i--) {
            reversedArray[arr.length - i] = arr[i - 1];
        }
        System.out.println(Arrays.toString(reversedArray));
    }

    public static void minMax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("Minimum: %d%nMaximum: %d%n", min, max);
    }

    public static boolean ProstoChislo(int chislo) {
        int count = 0;
        for (int i = 2; i < chislo; i++) {
            if (chislo % i == 0) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    public static void Matrix() {
//        int[][] matrix = new int[3][3];
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        int n = matrix.length;
        int y = matrix[0].length;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        for (int i = 0; i < n; i++) {
            sum += matrix[n - i - 1][i];
        }
        System.out.printf("Sum of diagonals with the middle num: %d%n", sum);
        System.out.printf("Sum of diagonals without the middle num: %d%n", sum - matrix[1][1]);
    }

    public static void Zvezdichki(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
