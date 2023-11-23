package SAA.LB_23_11_2023;

import java.util.Scanner;

public class Zad33 {
    public static final int br = 6;
    public static int[] moneti = {50, 20, 10, 5, 2, 1};

    public static void stotinki(int suma, int index) {
        if (index < br) {
            int count = suma / moneti[index];
            System.out.println("Broi moneti po " + moneti[index] + " st. = " + count);
            stotinki(suma % moneti[index], index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int sum = scanner.nextInt();
        stotinki(sum, 0);
    }
}
