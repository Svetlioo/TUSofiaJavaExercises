package LU.LU17_10_2023.additionalexercises.Person;

public class Student extends Person implements Printable{
    private double grade;

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void introduce() {
        System.out.printf("Name: %s%nAge: %d%nGrade: %.2f%n", this.name, this.age, grade);
    }

    @Override
    public void printDetails() {
        introduce();
    }
}
