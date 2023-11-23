package SAA.LB_23_11_2023;

import java.util.Scanner;

public class Zad32 {
    public static final int br = 6;
    public static int[] moneti = {50, 20, 10, 5, 2, 1};

    public static void stotinki(int suma) {
        int j = suma;
        for (int i = 0; i < br; i++) {
            System.out.println("Broi moneti po " + moneti[i] + " st. = " + j / moneti[i]);
            j = j % moneti[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int sum = scanner.nextInt();
        stotinki(sum);
    }
}
