package LU.LU31_10_2023.chervurta;

public class Employee {
    private String name;
    private String position;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < this.salary) try {
            throw new IllegalAccessException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        this.salary = salary;
    }

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}
