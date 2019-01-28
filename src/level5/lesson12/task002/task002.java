package level5.lesson12.task002;

public class task002 {
    public static class Dog {
        private String name;
        private int age;
        private int tail;

        public Dog (String name, int age, int tail) {
            this.name=name;
            this.age=age;
            this.tail=tail;
        }

        public String toString() {
            return name + " " + age + " " + tail;
        }

    }

    public static class Cat {
        private String name;
        private int age;
        private int tail;

        public Cat (String name, int age, int tail) {
            this.name=name;
            this.age=age;
            this.tail=tail;
        }

        public String toString() {
            return name + " " + age + " " + tail;
        }

    }

    public static class Mouse {
        private String name;
        private int age;
        private int tail;

        public Mouse (String name, int age, int tail) {
            this.name=name;
            this.age=age;
            this.tail=tail;
        }

        public String toString() {
            return name + " " + age + " " + tail;
        }

    }
    public static void main (String[] arg) {
        Dog dog = new Dog("Pluto", 15, 20);
        Cat cat = new Cat("Tomas", 10, 12);
        Mouse mouse = new Mouse("Jerry", 12, 9);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(mouse);
    }
}
