package LU.LU31_10_2023;

import LU.LU31_10_2023.chervurta.Employee;
import LU.LU31_10_2023.peta.Reservation;
import LU.LU31_10_2023.sedma.Project;
import LU.LU31_10_2023.sedma.Task;
import LU.LU31_10_2023.shesta.Stock;
import LU.LU31_10_2023.tretazadacha.Book;
import LU.LU31_10_2023.tretazadacha.Library;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double priceBeforeVAT = Double.parseDouble(sc.nextLine());
//        System.out.println(methodVAT(priceBeforeVAT, 10));
        ArrayList<String> list = new ArrayList<>();
        list.add("0895738475");
        list.add("0895738476");
        list.add("0895738477");
        list.add("0895738478");
        list.add("08957384783");
        list.add("8957384783");
        filterNumbers(list);
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("kniga 1", "ISBN1"));
        books.add(new Book("kniga 2", "isbn2"));
        Library library = new Library(books);
        library.searchBook("isbn1");
        library.searchBook("nqkakuv greshen");

        Employee employee = new Employee("Djami style", "Shefa na pleven", 500000);
        System.out.println(employee.getSalary());
        employee.setSalary(600000);
        System.out.println(employee.getSalary());
//        employee.setSalary(400000);
        Reservation reservaciq1 = new Reservation("djamaikata", "20/12/2023");
        Reservation rezervaciq2 = new Reservation("dgeto", "nqkvodetoneraboti");
        Stock stock = new Stock("tesla", 1000);
        try {
            stock.setCurrentPrice(Double.parseDouble("ne e chislo ochevidno"));
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
        }

        Project project1 = new Project(2);
        Project project2 = new Project(1);
        Task task1 = new Task("da si kupq mercedes");
        Task task2 = new Task("da si kupq beeve 1.8 is");
        project1.addToProject(task1);
        project1.addToProject(task2);
        project2.addToProject(task1);
        project2.addToProject(task2);

    }

    public static double methodVAT(double priceBeforeVAT, double percent) {
        try {
            return priceBeforeVAT + (priceBeforeVAT / 100 * percent);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        return -1;
    }

    public static void filterNumbers(ArrayList<String> list) {
        Pattern pattern = Pattern.compile("^0[1-9]{9}$");
//        Pattern pattern = Pattern.compile(  "\\+?\\d+");

        for (String num : list) {
            if (pattern.matcher(num).find()) {
                System.out.println(num + " matches!");
            } else {
                System.out.println(num + " does not match!");
            }
        }
    }
}
