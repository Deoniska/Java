package level5.lesson7.task014;

public class Person {

    private String name;
    private int age;

    public void initialize(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Denis", 30);
    }
}
