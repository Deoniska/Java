package level5.lesson12.task004;

public class test {


/*
По 50 000 объектов Cat и Dog
*/

    public static void main(String[] args) {
        // напишите тут ваш код
        for(int i = 0; i < 500000; i++)
        {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}

