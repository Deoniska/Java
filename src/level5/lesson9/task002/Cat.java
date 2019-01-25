package level5.lesson9.task002;

import java.security.PublicKey;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String color;
    private String address;

    public Cat (String name) {
        this.name=name;
        this.age=0;
        this.weight=0;
        this.color="blue";
    }

    public Cat(String name, int weight, int age) {
        this.name=name;
        this.weight=weight;
        this.age=age;
        this.color="green";
    }

    public Cat(String name, int age) {
        this.name=name;
        this.age=age;
        this.weight=0;
        this.color="red";
    }

    public Cat(int weight, String color) {
        this.age=0;
        this.weight=weight;
        this.color=color;

    }

    public Cat(int weight, String color, String address) {
        this.age=0;
        this.weight=weight;
        this.color=color;
        this.address=address;
    }

    public static void main (String[] args) {

    }
}
