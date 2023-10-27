package LU.LU17_10_2023.additionalexercises.Person;

public class Person implements Printable {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void introduce() {
        System.out.printf("Name: %s%nAge: %d%n", this.name, this.age);
    }

    public static void main(String[] args) {
        Person person = new Person("djami", 19);
        person.introduce();
    }

    @Override
    public void printDetails() {
        introduce();
    }
}
