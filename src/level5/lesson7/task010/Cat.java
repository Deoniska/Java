package level5.lesson7.task010;
/*
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age=1;
    private int weight=10;
    private String address;
    private String color="gray";

    public void initialize(String name) {
        this.name=name;
    }

    public void initialize(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void initialize(String name, int weight, int age) {
        this.name=name;
        this.weight=weight;
        this.age=age;
    }

    public void initialize(int weight, String color) {
        this.weight=weight;
        this.color=color;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;//напишите тут ваш код
    }

    public void initialize (String name, int age, int weight, String color){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color = color;

    }


    public static void main(String[] args) {

    }
}