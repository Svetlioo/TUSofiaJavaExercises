package SAA.LB_09_11_2023;

public class Zad25 {

    static double Power(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) return Power(1 / x, -n);
        return x * Power(x, n - 1);
    }

    public static void main(String[] args) {
        double x = 6;
        int n = -1;
        double result = Power(x, n);
        System.out.println(x + " ^ " + n + " = " + result);
    }
}
