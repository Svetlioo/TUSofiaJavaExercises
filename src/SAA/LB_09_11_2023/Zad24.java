package SAA.LB_09_11_2023;

public class Zad24 {

    public static void main(String[] args) {
        int decimalNumber = 10;
        System.out.println(convertDecimalToBinary(decimalNumber));
    }

    static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        return convertDecimalToBinary(decimal / 2) + decimal % 2;
    }
}

