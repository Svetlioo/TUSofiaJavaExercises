package SAA.LB_23_11_2023;

public class Zad48 {
    public static String name = "djamaikata";
    public static String name2 = "racecar";

    public static boolean PalindromeCheck(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(PalindromeCheck(name));
        System.out.println(PalindromeCheck(name2));
    }

}
