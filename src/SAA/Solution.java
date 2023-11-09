package SAA;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] matrix = new int[n][n];
        int n = 3;
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sumaPerimetur = 0;
        int sumaElementDvaDiagonala = 0;
        int broiNechetni = 0;
        int maxElement = Integer.MIN_VALUE;
        int maxSumRed = 0;

        for (int row = 0; row < n; row++) {
            int currentRowSum = 0;
            for (int col = 0; col < n; col++) {
                currentRowSum += matrix[row][col];
                if (matrix[row][col] % 2 != 0) {
                    broiNechetni++;
                }
                if (matrix[row][col] > maxElement) {
                    maxElement = matrix[row][col];
                }
            }
            if (currentRowSum > maxSumRed) {
                maxSumRed = currentRowSum;
            }
        }

        for (int i = 0; i < n; i++) {
            sumaElementDvaDiagonala += matrix[i][i];
        }
        for (int i = n - 1; i >= 0; i--) {
            sumaElementDvaDiagonala += matrix[n - 1 - i][i];
        }

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < n; i++) {
            // purvi red
            sumaPerimetur += matrix[0][i];
            //posleden red
            sumaPerimetur += matrix[n - 1][i];
            //purva kolona
            sumaPerimetur += matrix[i][0];
            //posledna kolona
            sumaPerimetur += matrix[i][n - 1];
        }

        //mahame uglite
        sumaPerimetur -= matrix[0][0];
        sumaPerimetur -= matrix[0][n - 1];
        sumaPerimetur -= matrix[n - 1][n - 1];
        sumaPerimetur -= matrix[n - 1][0];


        System.out.println("Suma perimetur : " + sumaPerimetur);
        System.out.println("sumaElementDvaDiagonala : " + sumaElementDvaDiagonala);
        System.out.println("broiNechetni : " + broiNechetni);
        System.out.println("maxElement : " + maxElement);
        System.out.println("maxSumRed : " + maxSumRed);

    }

}
