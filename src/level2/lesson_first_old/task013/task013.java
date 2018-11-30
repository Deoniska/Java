package level2.lesson_first_old.task013;

/*
Питомцам нужны люди
*/

public class task013 {
    public static void main(String[] args) {

        Woman woman = new Woman();

        Cat cat = new Cat();
        cat.owner = woman;

        Dog dog = new Dog();
        dog.owner = woman;

        Fish fish = new Fish();
        fish.owner = woman;
        //напишите тут ваш код
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
